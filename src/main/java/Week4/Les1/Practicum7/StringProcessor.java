package Week4.Les1.Practicum7;

import java.util.ArrayList;

public class StringProcessor {

    ArrayList <OpmaakProces> process = new ArrayList<>();

    public StringProcessor(){

    }

    public void voegProcesToe(OpmaakProces process){
        this.process.add(process);
    }

    public String verwerk(String inputString) {
        for (OpmaakProces proces:process) {
           inputString =  proces.opmaak(inputString);
        }
        return inputString;
    }
}
