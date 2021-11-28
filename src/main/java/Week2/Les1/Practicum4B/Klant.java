package Week2.Les1.Practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        naam = nm;
    }

    public String getNaam () {

        return naam;
    }


    public void setKorting(double kP) {

        this.kortingsPercentage = kP;
    }

    public double getKorting () {

        return this.kortingsPercentage;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", kortingsPercentage=" + kortingsPercentage +
                '}';
    }
}

