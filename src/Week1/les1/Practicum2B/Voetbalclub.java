package Week1.les1.Practicum2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalGespeeld;

    public Voetbalclub(String Naam) {
        naam = Naam;
    }



    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }


    public int aantalPunten() {

        return ((aantalGewonnen * 3 ) + (aantalGelijk));
    }

    public int aantalGespeeld() {

        return aantalGewonnen + aantalVerloren + aantalGelijk;
    }

    public String toString(){
        return " "+naam +" "+aantalGespeeld()+" "+aantalPunten()+" ";
    }

    //array method ?
}
