package Week4.Les1.Practicum8;

import java.util.ArrayList;
import java.util.Objects;
/*
Klasse BedrijfsInventaris heeft 2 methoden.
 */
public class BedrijfsInventaris {
    private String bedrijfnaam;
    private double budget ;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String bedrijfnaam, double budget) {
        this.bedrijfnaam = bedrijfnaam;
        this.budget = budget;
    }

    public String getBedrijfnaam() {
        return bedrijfnaam;
    }

    /*
Methode schafAan(Goed) gebruik je om een goed aan te schaffen.
Dat kan alleen if( dat goed niet al een keer aan de inventaris is
toegevoegd && als er voldoende budget is)
 */

    public void schafAan(Goed g){
        if(!alleGoederen.contains(g) && this.budget >= g.huidigeWaarde()){
            alleGoederen.add(g);
            this.budget -= g.huidigeWaarde();
        }
    }

    /*
    Methode toString() geeft de hele inventaris weer, waarbij alle goederen onder elkaar getoond worden.
     */
    @Override
    public String toString() {
        String s = "";
        for (Goed goederen: alleGoederen) {
            s +="\n"+ goederen;
        }
        return s;
    }
}
