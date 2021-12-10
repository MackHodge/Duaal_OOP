package Week3.Les1.Practicum6A;

import java.time.LocalDate;

public class Game {

    private String naam;
    final private int  releaseJaar;
    private double nieuwprijs;

    private int huidigJaar ;
    private double discoutPrijs;

    public Game(String Title, int ReleaseJaar, double Prijs) {
            naam = Title;
            releaseJaar = ReleaseJaar;
            nieuwprijs = Prijs;

            huidigJaar = LocalDate.now().getYear();
    }

    public String getNaam() {
        return naam;
    }

    public int getReleaseJaar() {
        return releaseJaar;
    }

    public double getDiscoutPrijs() {
        return discoutPrijs;
    }

    public int getHuidigJaar() {
        return huidigJaar;
    }


    public double getNieuwprijs() {
        return nieuwprijs;
    }

    public double huidigeWaarde (){
        double t;
        return t = (releaseJaar != huidigJaar)? discoutPrijs = nieuwprijs - (nieuwprijs *0.30) : nieuwprijs;

    }


    @Override
    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;
        if(andereObject instanceof Game){
            Game andereGame = (Game) andereObject;
            if(this.naam.equals(andereGame.naam) && this.releaseJaar == andereGame.releaseJaar && this.nieuwprijs == andereGame.nieuwprijs   && this.huidigJaar == andereGame.huidigJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    @Override
    public String toString() {
        return ""+naam + ", uitgegeven in " + " " + releaseJaar + "; nieuwprijs " + nieuwprijs + " nu voor: " + String.format("%.2f", discoutPrijs) + "\n";
    }
}
