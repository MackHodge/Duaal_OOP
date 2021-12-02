package Week2.Les1.Practicum4A;

public class Huis   {
    private String adres;
    private int bouwjaar;
    private Persoon _Persoon;

    public Huis(String adr, int bwjr) {
        adres = adr;
        bouwjaar = bwjr;
    }


    public void setHuisbaas(Persoon hb) {
        _Persoon = hb;
    }
    public Persoon getHuisbaas() {

        return _Persoon;
    }

    @Override
    public String toString() {
        return "Huis" +
                " " + adres + " is gebouwd in" +
                " " + bouwjaar + "\n en heeft huisbaas " +_Persoon.getNaam()+"; leeftijd " + _Persoon.getLeeftijd()+" jaar";
    }
}



