package Week2.Les1.Practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public String getAutotype(){

        return this.type;
    }

    public void setPrijsPerDag (double prPd) {

        this.prijsPerDag = prPd;
    }
    public double getPrijsPerDag(){
        return this.prijsPerDag;
    }

    @Override
    public String toString(){
        return "autotype: "+this.type +" met prijs per dag: "+this.prijsPerDag+" ";

    }
}
