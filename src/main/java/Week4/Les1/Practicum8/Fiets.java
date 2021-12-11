package Week4.Les1.Practicum8;

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
            if(this.framenummer == andereFiets.framenummer){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    @Override
    public double huidigeWaarde() {

        return nieuwprijs;
    }
}
