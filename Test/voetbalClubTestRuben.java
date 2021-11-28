import Week1.les1.Practicum2B.Voetbalclub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class voetbalClubTestRuben {

    @Test
    public void ifNameIsNothingNameShouldBeFC(){
        Voetbalclub fc = new Voetbalclub("");

        Assertions.assertEquals(fc.getNaam(), "FC");
    }

    @Test
    void pointsShouldReturn(){
        Voetbalclub vc = new Voetbalclub("");

        vc.verwerkResultaat('w');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('v');

        Assertions.assertEquals(vc.getAantalGewonnen() * 3,3);
        Assertions.assertEquals(vc.getAantalGelijk() , 1);
        Assertions.assertEquals(vc.getAantalVerloren() - 1, 0);
    }

    @Test
    void ToStringReturnsCorrectData(){
        Voetbalclub vc = new Voetbalclub("");

        Assertions.assertTrue(vc.toString().contains(""+vc.getNaam() +" "+vc.aantalGespeeld()+" "+vc.aantalPunten()+""));
    }

    @Test
    void AantalPuntenReturnsCorrectData(){
        Voetbalclub vc = new Voetbalclub("");

        Assertions.assertEquals(vc.aantalPunten(),(vc.getAantalGewonnen() * vc.gPunten() ) + (vc.getAantalGelijk()));

    }
}
