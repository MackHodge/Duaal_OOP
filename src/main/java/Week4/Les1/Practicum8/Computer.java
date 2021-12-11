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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.aanschafPrijs, aanschafPrijs) == 0 && productieJaar == computer.productieJaar && type.equals(computer.type) && macAdres.equals(computer.macAdres);
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
        return "Computer type: " + type + " macAdres: " + macAdres + "" + ", Prijs: " + String.format("%.2f", aanschafPrijs )+ "  productieJaar: " + productieJaar +"";
    }
}
