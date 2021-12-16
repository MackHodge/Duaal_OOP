package Week4.Les1.Practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig{

    private final int framenummer ;


    public Fiets(String type, double nieuwprijs, int bouwjaar ,int fnr) {
       super(type, nieuwprijs, bouwjaar);

        framenummer = fnr;
    }

    //write equals
    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;
        if(andereObject instanceof Fiets){
            Fiets andereFiets = (Fiets) andereObject;
            if(this.framenummer == andereFiets.framenummer && super.equals(andereFiets)){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    public int huidigeJaar(){
        return LocalDate.now().getYear();
    }
    @Override
    public double huidigeWaarde() {
        int verschilInJaar = huidigeJaar() - this.bouwjaar;
        return (this.bouwjaar != huidigeJaar()) ? nieuwprijs *  (Math.pow(0.90 , verschilInJaar)) : 0 ;
    }
}
