package Week4.Les1.Practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig{

    private String kenteken;

    public Auto(String type, double nieuwprijs, int bouwjaar , String kt) {
        super(type, nieuwprijs, bouwjaar);
        this.kenteken = kt;
    }

    @Override
    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;
        if(andereObject instanceof Auto){
            Auto andereAuto = (Auto) andereObject;
            if(this.kenteken == andereAuto.kenteken && super.equals(andereAuto)){
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
        return (this.bouwjaar != huidigeJaar()) ? nieuwprijs *  (Math.pow(0.70 , verschilInJaar)) : 0 ;
    }
}
