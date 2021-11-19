package Week1.les1.Practicum2A;

public class Zwembad {
    private double _Breedte ;
    private double _Lengte ;
    private double _Diepte ;
    private double inhoud ;

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
        return "Dit zwembad is 2.5 meter breed, 100.0 meter lang, en 2.0 meter diep";
    }
}
