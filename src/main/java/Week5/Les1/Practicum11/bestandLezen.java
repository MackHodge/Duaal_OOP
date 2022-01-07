package Week5.Les1.Practicum11;

import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class bestandLezen {

    private Path enteredPath;
    private String bestemmingsbestand;
    private double usdNaarEuro;

    List<String> alleRegels ;

    public bestandLezen(Path nmBronbestand ) throws IOException {
        this.enteredPath = nmBronbestand;

        alleRegels = Files.readAllLines(enteredPath);
    }

    public bestandLezen(Path nmBronbestand , double usdNaarEuro) throws IOException {
        this.enteredPath = nmBronbestand;
        this.usdNaarEuro = usdNaarEuro;
        alleRegels = Files.readAllLines(enteredPath);
    }


    public bestandLezen(Path nmBronbestand , String bestemmingsbestand){
        this.enteredPath = nmBronbestand;
        this.bestemmingsbestand = bestemmingsbestand;


       // Files.readAllLines(enteredPath);
    }

    public bestandLezen(Path nmBronbestand , String bestemmingsbestand , double usdNaarEuro){
        this.enteredPath = nmBronbestand;
        this.bestemmingsbestand = bestemmingsbestand;
        this.usdNaarEuro = usdNaarEuro;

        // Files.readAllLines(enteredPath);
    }

   //search for :
    //split at index
    //take the right side
   // trim white lines
   // convert to double  , make it euro , put it back

    public void getPriceFromString(Double usdNaarEuro){
        String s = "";
        List <String> newList = new ArrayList<>() ;
        String newString = "";
        double d  ;
       for  (String regel : alleRegels){
         s = regel.substring(regel.indexOf(":") + 1).trim();
         d = Double.parseDouble(s);

        newString = regel.replace( Double.toString(d) , Double.toString(newPrice(d)) );

        newList.add(newString);
       }

       alleRegels.clear();
       alleRegels.addAll(newList);

    }



    private double newPrice (double price){

        return price * usdNaarEuro ;

    }

    @Override
    public String toString() {
        String s = "";
        for (String regel :  alleRegels){
            s  += "\n" +regel;
        }
        return s;
    }
}
