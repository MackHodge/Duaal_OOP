package Week2.Les1.Practicum4B;


public class AutoHuur {

    private int aantalDagen;
    private Klant klant;
    private Auto auto;

    public AutoHuur (){
        klant = new Klant();
        auto = new Auto();
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void setAantalDagen(int i) {
    }

    public int getAantalDagen () {
        return 1;
    }

    public void setGehuurdeAuto(Auto gA) {
    }
    public Auto getGehuurdeAuto() {
        return auto;
    }

    public void setHuurder(Klant k) {
    }

    public Klant getHuurder () {

        return klant;
    }
    public double totaalPrijs () {

        return 0.0;
    }
    @Override
    public String toString(){
        String s = "" , t = "" , e = "";
        if(getAuto() == null){
            s = "Er is nog geen auto bekend";
        }else{
            s ="autotype: "+getGehuurdeAuto().getAutotype()+" met prijs per dag: "+getGehuurdeAuto().getPrijsPerDag()+"";
        }
        if(getKlant() == null){
           t = "er is geen huurder bekend";
        }else{
            t = "op naam van: Mijnheer de Vries (korting: "+klant.getKorting()+")";
        }
        return s +"\n"+ t;
    }



}
