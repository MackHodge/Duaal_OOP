package Week2.Les1.Practicum4B;


public class AutoHuur {

    private int aantalDagen;
    private Klant klant;
    private Auto auto;

    public AutoHuur (){

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
        if(this.auto == null){
            s = "Er is nog geen auto bekend";
        }else{
            s ="autotype: "+getGehuurdeAuto().getAutotype()+" met prijs per dag: "+getGehuurdeAuto().getPrijsPerDag()+"";
        }
        if(this.klant == null){
           t = "er is geen huurder bekend";
        }else{
            t = "op naam van: Mijnheer de Vries (korting: "+klant.getKorting()+")";
        }
        return s +"\n"+ t;
    }



}
