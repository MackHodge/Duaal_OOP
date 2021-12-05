package Week1.les1.Practicum2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int aantalGespeeld;

    public Voetbalclub(String Naam) {
        naam = Naam;
        setWhenNull();
    }


    public String getNaam () { return naam;}
    public String setNaam (String naam) { this.naam = naam; return naam;}

    public int getAantalGewonnen () {return aantalGewonnen;}

    public int getAantalGelijk () {return aantalGelijk;}

    public int getAantalVerloren () {return aantalVerloren;}

    public int wPunten () {return 3;}
    public int gPunten () {return 1;}
    public int vPunten () {return 0;}



    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }


    public void setWhenNull(){
        if(getNaam() == null  || getNaam().isEmpty() ){
            setNaam("FC");
        }
    }


    public int aantalPunten() {

        return ((aantalGewonnen * 3 ) + (aantalGelijk));
    }

    public int aantalGespeeld() {

        return aantalGewonnen + aantalVerloren + aantalGelijk;
    }

    public String toString(){
        return " "+getNaam() +" "+aantalGespeeld()+" "+getAantalGewonnen()+ " "+getAantalGelijk()+ " "+getAantalVerloren()+" "+aantalPunten()+ " ";
    }

}
