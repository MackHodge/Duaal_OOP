package Week1.les1.Practicum2A;

public class Zwembad {
    private double breedte ;
    private double lengte;
    private double diepte;


    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this. lengte = lengte;
        this.diepte =  diepte;

    }

    public Zwembad (){

    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }


    public void setBreedte(double breedte) {
        breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }
    public double inhoud() {

        return diepte * lengte * breedte;
    }

    public String toString(){

     //String manier2 = String.format("Dit zwembad is %s meter breed, %s meter lang, en %s meter diep", getBreedte(), getLengte(), getDiepte());
        return "Dit zwembad is " + getBreedte() + " meter breed, " + getLengte() +  " meter lang, en " +getDiepte()+ " meter diep";
    }
}
