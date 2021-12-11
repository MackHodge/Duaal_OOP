package Week4.Les1.Practicum8;
/*
Klasse Voertuig doet dat ook, maar is abstract omdat voor concrete voertuigen twee concrete klassen zijn gemaakt: Auto en Fiets.

Alle goederen hebben de methode equals(Object) en huidigeWaarde() waarmee respectievelijk
twee goederen vergeleken kunnen worden en de waarde van een voorwerp kan worden uitgerekend.
Een computer wordt jaarlijks 40% minder waard, een auto 30% en een fiets 10%,
gerekend vanaf het bouw- of productiejaar.
 */

public abstract class  Voertuig implements  Goed{

    private String type ;
    protected double nieuwprijs ;
    protected int bouwjaar;

    public Voertuig(String type, double nieuwprijs, int bouwjaar) {
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voertuig voertuig = (Voertuig) o;
        return Double.compare(voertuig.nieuwprijs, nieuwprijs) == 0 && bouwjaar == voertuig.bouwjaar && type.equals(voertuig.type);
    }

    /*
    dan levert de toString() van dit object de volgende (vetgedrukte) string op:
    Voertuig: Mercedes-Benz A-klasse A 180 met bouwjaar 2019 heeft een
    waarde van: €20996.5.
    De exacte waarde hangt af van het jaar waarin je de toString uitvoert!
     */
    @Override
    public String toString() {
        String s ="Voertuig " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van " + String.format("%.2f", huidigeWaarde() ) + "" ;
        return s ;
    }
}
