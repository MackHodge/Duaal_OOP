package Week2.Les1.Practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public void setPrijsPerDag (double prPd) {

        this.prijsPerDag = prPd;
    }
    public double getPrijsPerDag(){
        return this.prijsPerDag;
    }

    public String toString(){
        return "";
    }
}
