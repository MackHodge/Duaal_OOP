package Week4.Les1.Practicum8;

import java.time.LocalDate;

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

    public int huidigeJaar(){
        return LocalDate.now().getYear();
    }
    @Override
    public double huidigeWaarde() {
        int verschilInJaar = huidigeJaar() - this.bouwjaar;
        return (this.bouwjaar != huidigeJaar()) ? nieuwprijs *  (Math.pow(0.70 , verschilInJaar)) : 0 ;
    }
}
