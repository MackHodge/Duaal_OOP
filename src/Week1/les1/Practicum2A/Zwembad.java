package Week1.les1.Practicum2A;

public class Zwembad {
    private double _Breedte ;
    private double _Lengte ;
    private double _Diepte ;


    public Zwembad(double breedte, double Lengte, double Diepte) {
        _Breedte = breedte;
        _Lengte = Lengte;
        _Diepte =  Diepte;

    }

    public Zwembad (){

    }

    public double getBreedte() {
        return _Breedte;
    }

    public double getLengte() {
        return _Lengte;
    }

    public double getDiepte() {
        return _Diepte;
    }


    public void setBreedte(double breedte) {
        _Breedte = breedte;
    }

    public void setLengte(double lengte) {
        _Lengte = lengte;
    }

    public void setDiepte(double diepte) {
        _Diepte = diepte;
    }
    public double inhoud() {

        return _Diepte * _Lengte * _Breedte;
    }

    public String toString(){

     //String manier2 = String.format("Dit zwembad is %s meter breed, %s meter lang, en %s meter diep", getBreedte(), getLengte(), getDiepte());
        return "Dit zwembad is " + getBreedte() + " meter breed, " + getLengte() +  " meter lang, en " +getDiepte()+ " meter diep";
    }
}
