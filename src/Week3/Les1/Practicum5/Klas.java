package Week3.Les1.Practicum5;

import java.util.ArrayList;

public class Klas {

    private ArrayList<Leerling>leerlingen ;
    private Leerling lArr [] ;

    private String KlasNaam ;
    private Leerling leerling;

    public  Klas (String klass){
     this.KlasNaam = klass;
     leerlingen = new ArrayList<Leerling>();
     this.leerling = new Leerling();
     lArr = new Leerling [leerlingen.size()];
    }

    public void setLeerling(Leerling leerling){
        this.leerling = leerling;
    }
    public Leerling getLeerling (){

        return leerling;
    }
    public String getKlasNaam(){
        return KlasNaam;
    }

    /**
     * Takes a type leerling
     * @param leerling
     */
    public void voegLeerlingToe (Leerling leerling) {
        leerlingen.add(leerling);
    }

    /**
     *if arraylist contains this leerling set this grade
     * @param leerling take leering that needs to change grade
     * @param g grade to be changed to
     */
    public void wijzigCijfer(String leerling, double g) {

        for(var s:leerlingen){
            if(s.getNaam() == leerling){
                s.setCijfer(g);
            }
        }

    }

    public ArrayList<Leerling>  getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen() {
        return leerlingen.size();
    }


    @Override
    public String toString() {
        String s = "In klas "+ getKlasNaam() + " zitten de volgende leerlingen:\n" , t = "";
        for (int i = 0 ; i < getLeerlingen().size() ; i++){
            t += getLeerlingen().get(i);
        }
        return ""+s+"" +
                "" + t +  "";
    }
}
