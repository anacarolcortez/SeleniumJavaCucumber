package tricentis.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

    //Classe responsável pelos métodos que serão sempre executados antes e depois dos testes

    private String url = "http://sampleapp.tricentis.com/101/app.php";

    @Before
    public void navigate(){
        startDriver();
        getDriver().manage().window().maximize();
        getDriver().get(url);
    }

    @After
    public void closeSession(){
        closeDriver();
    }

}
