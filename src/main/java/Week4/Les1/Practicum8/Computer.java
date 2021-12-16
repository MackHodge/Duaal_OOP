package Week4.Les1.Practicum8;

import java.time.LocalDate;
import java.util.Date;

/*
Klasse Computer implementeert de interface Goed, en daarmee kan een computer aan de inventaris worden toegevoegd.
dus in app (main)
 */
public class Computer implements Goed{
    private String type ;
    private final String macAdres;
    private double aanschafPrijs ;
    private int productieJaar;

    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar) {
        this.type = type;
        this.macAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }


    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;
        if(andereObject instanceof Computer){
            Computer andereComputer = (Computer) andereObject;
            if(this.aanschafPrijs == andereComputer.aanschafPrijs && this.productieJaar == andereComputer.productieJaar && this.type.equals(andereComputer.type) && this.macAdres.equals(andereComputer.macAdres)){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    /*
    huidigeWaarde() waarmee respectievelijk twee goederen vergeleken kunnen worden en de waarde van een voorwerp kan worden uitgerekend. Een computer wordt jaarlijks 40%
    minder waard, een auto 30% en een fiets 10%, gerekend vanaf het bouw- of productiejaar.
     */
    public int huidigeJaar(){
        return LocalDate.now().getYear();
    }
    @Override
    public double huidigeWaarde() {
        int verschilInJaar = huidigeJaar() - this.productieJaar;
        return (this.productieJaar != huidigeJaar()) ? aanschafPrijs *  (Math.pow(0.60 , verschilInJaar)) : 0 ;
    }
    /*
    Verzin zelf de toString van Computer, maar zorg dat daar in ieder geval het type en de huidige waarde in opgenomen zijn.
     */
    @Override
    public String toString() {
        return "Computer type: " + type + " macAdres: " + macAdres + "" + ", Prijs: " + Utils.euroBedrag(aanschafPrijs)+ "  productieJaar: " + productieJaar +"";
    }
}
