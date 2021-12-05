package Week2.Les1.Practicum4B;


public class AutoHuur {

    private int aantalDagen;
    private Klant klant;
    private Auto auto;

    public AutoHuur (){

    }

    public Klant getKlant() {
        return klant;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.auto = gA;
    }

    public void setHuurder(Klant k) {
        this.klant = k ;
    }

    public void setAantalDagen(int i) {
        aantalDagen =  i ;
    }

    public int getAantalDagen () {
        return aantalDagen;
    }


    public Auto getGehuurdeAuto() {
        return auto;
    }


    public double totaalPrijs () {

        if(getKlant() != null && getAuto() != null) {
            double result = (100.0 - getKlant().getKorting()) / 100;

            return (getAuto().getPrijsPerDag() * getAantalDagen()) * result;
        }else {
            return 0;
        }
    }
    @Override
    public String toString(){
        String s = "" , t = "" , e = "";
        if(getAuto() == null){
            s = "Er is nog geen auto bekend";
        }else{
            s ="autotype: "+getAuto().getAutotype()+" met prijs per dag: "+getAuto().getPrijsPerDag()+"";
        }
        if(getKlant() == null){
           t = "er is geen huurder bekend";
        }else{
            t = "op naam van: "+getKlant().getNaam()+" (korting: "+getKlant().getKorting()+"%)";
        }

        e = "aantal dagen: " +getAantalDagen() + " en dat kost " +totaalPrijs() +" ";
        return s +"\n"+ t +"\n"+ e +"";
    }



}
