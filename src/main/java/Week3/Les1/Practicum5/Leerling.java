package Week3.Les1.Practicum5;

public class Leerling {
    private String naam;
    private double cijfer;

    /**
     * Constructor
     * @param naam Leerling naam
     */
    public Leerling(String naam){
    this.naam = naam;
    }

    public Leerling(){

    }

    public String getNaam() {
        return naam;
    }

    public double getCijfer() {
        return cijfer;
    }

    /**
     * Takes new grade
     * @param c set new grade
     */
    public void setCijfer(double c){
        cijfer = c;
    }

    @Override
    public String toString() {
        return "" +
                "" + getNaam() +
                " heeft cijfer " + getCijfer() +
                "\n";
    }
}
