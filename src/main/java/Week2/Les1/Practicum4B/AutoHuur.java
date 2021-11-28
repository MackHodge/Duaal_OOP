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

        return 0;
    }

    public String toString(){
        String s = null;
        if(getGehuurdeAuto() == null){
            s= "Er is nog geen auto gehuurd";
        }
        if(getHuurder() == null){
            s = "Er is nog geen huurder";
        }
        return s;
    }



}
