import Week1.les1.Practicum2B.Voetbalclub;
import Week2.Les1.Practicum4B.Auto;
import Week2.Les1.Practicum4B.AutoHuur;
import Week2.Les1.Practicum4B.Klant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AutoHuurTest {
    @Test
    void ifAutoIsnullAddErrorMessage () {
        AutoHuur ah = new AutoHuur();

        Assertions.assertTrue(ah.toString().contains("Er is nog geen auto bekend`"));
    }

    @Test
    void calculateTotal(){
        AutoHuur ah = new AutoHuur();


        //Assertions.assertTrue();
    }

    @Test
    void heeftKorting(){
        AutoHuur ah = new AutoHuur();
        Klant k = new Klant();

        //Assertions.assertTrue();
    }




    @Test
    void aantalDagenCanNotBeNegative(){
        AutoHuur ah = new AutoHuur();
        ah.setAantalDagen(1);
        Assertions.assertTrue(ah.getAantalDagen() > 0);
    }




}
