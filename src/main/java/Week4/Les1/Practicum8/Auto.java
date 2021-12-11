package Week4.Les1.Practicum8;

public class Auto extends Voertuig{

    private String kenteken;

    public Auto(String type, double nieuwprijs, int bouwjaar , String kt) {
        super(type, nieuwprijs, bouwjaar);
        this.kenteken = kt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Auto auto = (Auto) o;
        return kenteken.equals(auto.kenteken);
    }

    @Override
    public double huidigeWaarde() {

        return nieuwprijs;
    }
}
