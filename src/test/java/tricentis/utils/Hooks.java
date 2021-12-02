package tricentis.utils;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tricentis.utils.evidences.WordFactory;

import java.io.File;
import java.io.IOException;

public class Hooks extends Base {

    //Classe responsável pelos métodos que serão sempre executados antes e depois dos testes

    private String url = "http://sampleapp.tricentis.com/101/app.php";
    private WordFactory wordFactory = new WordFactory();

    @Before
    public void startNavigation(Scenario scenario){
        startDriver();
        getDriver().manage().window().maximize();
        getDriver().get(url);
        wordFactory.addText("Test Case: "+scenario.getName());
        wordFactory.addText("Executed at: "+getDateAndTime());
        wordFactory.addText("Status: Passed");
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) throws IOException {
        File finalShotFile = new File("evidences", scenario.getName());
        File shotFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(shotFile, finalShotFile);
        wordFactory.addEvidence("evidences/" + scenario.getName(), scenario);
    }

    @After
    public void closeSession(Scenario scenario){
        wordFactory.generateWordFile(scenario.getName());
        closeDriver();
    }

}
