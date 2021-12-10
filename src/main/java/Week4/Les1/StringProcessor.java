package Week4.Les1;

import java.util.ArrayList;

public class StringProcessor {

    ArrayList <OpmaakProces> process = new ArrayList<>();

    public StringProcessor(){

    }

    public void voegProcesToe(VervangProces vervangProces){
        // ‘voegProcesToe()’ waarmee een proces kan worden toegevoegd aan de ArrayList van processen.
        process.add(vervangProces);
    }
    public void voegProcesToe(HoofdletterProces hoofdletterProces)
    {
        // ‘voegProcesToe()’ waarmee een proces kan worden toegevoegd aan de ArrayList van processen.
        process.add(hoofdletterProces);

    }

    public String verwerk(String inputString) {

        return inputString;
    }
}
