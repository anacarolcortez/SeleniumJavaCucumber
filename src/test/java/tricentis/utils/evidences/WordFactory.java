package tricentis.utils.evidences;

import io.cucumber.java.Scenario;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.*;

import java.io.*;

public class WordFactory {
    XWPFDocument word;
    XWPFParagraph paragraph;
    XWPFRun run;

    public WordFactory(){
        word = new XWPFDocument();
    }

    public void newParagraph(){
        paragraph = word.createParagraph();
        run = paragraph.createRun();
    }

    public void addText(String text){
        newParagraph();
        run.setBold(true);
        run.setText(text);
    }

    public void addEvidence(String fileName, Scenario scenario) {
        try{
            newParagraph();
            paragraph.setAlignment(ParagraphAlignment.CENTER);
            run.addBreak();
            InputStream screenshot = new FileInputStream(fileName);
            run.addPicture(screenshot, Document.PICTURE_TYPE_PNG, scenario.getName(), Units.toEMU(350), Units.toEMU(250));
        }catch (IOException | InvalidFormatException ex){
            ex.printStackTrace();
        }
    }

    public void generateWordFile(String name){
        try{
            OutputStream finalDoc = new FileOutputStream("evidences/"+name+".docx");
            word.write(finalDoc);
            word.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
