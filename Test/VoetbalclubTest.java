import Week1.les1.Practicum2B.Voetbalclub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VoetbalclubTest {
    @Test
    void ifNameIsNullMethodNameShouldBeFC(){
        Voetbalclub vc = new Voetbalclub("");

            Assertions.assertEquals(vc.getNaam(),"FC");

    }

    @Test
    void checkPoints(){
        Voetbalclub vc = new Voetbalclub("Ajax");

        vc.verwerkResultaat('w');
        vc.verwerkResultaat('g');
        vc.verwerkResultaat('v');

        Assertions.assertEquals(vc.getAantalGewonnen() * 3,3);
        Assertions.assertEquals(vc.getAantalGelijk() , 1);
        Assertions.assertEquals(vc.getAantalVerloren() - 1, 0);
    }
    @Test
    void checkToString(){
        Voetbalclub vc = new Voetbalclub("");


        Assertions.assertTrue(vc.toString().contains(""+vc.getNaam() +" "+vc.aantalGespeeld()+" "+vc.aantalPunten()+""));


    }

    @Test
    void countPoints(){
        Voetbalclub vc = new Voetbalclub("");

        Assertions.assertEquals(vc.aantalPunten(),(vc.getAantalGewonnen() * vc.gPunten() ) + (vc.getAantalGelijk()));

    }


    @Test
    void nameCantBeNull(){
        Voetbalclub vc = new Voetbalclub("");

        Assertions.assertNotEquals(vc.getNaam(),null);
    }
}
