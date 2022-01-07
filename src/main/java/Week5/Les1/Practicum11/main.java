package Week5.Les1.Practicum11;

import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class main {
   public static void main (String [] args) throws IOException, InterruptedException {
        boolean erorr = false;
        int count = 0 ;
       Scanner s = new Scanner(System.in);

       Path enterPath = Path.of("");


           System.out.println("Please enter a Much path");
           try{
               enterPath = Path.of(s.nextLine()) ;
           }catch (Exception e) {
               System.out.println("Path invalid"+ e);
               System.out.println("Try again");

           }
            erorr = true;


       // Zorg voor verschillende meldingen (geen stacktraces) als de gebruiker onbruikbare invoer geeft \
       // (koers in letters / niet bestaand bronbestand etc.).

       //1.naam van de bronbestand
          //  Path p = Path.of("docs.txt");

       //2.het bestemmingsbestand

        //3.de waarde van 1 US dollar in Eurocenten  : 2021 december :  1 USD equals to 0,89 Euro
       System.out.println("1 US dollar in Eurocenten : ");
       double convertEuro  = 0;
       try{
            convertEuro = Double.parseDouble(s.nextLine()) ;
       }catch (NumberFormatException e)
       {
           System.out.println(e +" is not a double");
       }
       //if there is no error call method that takes the euro and replace the dollar to euro .. if e is empty

       //then print

            bestandLezen b = new bestandLezen(enterPath ,convertEuro );
            b.getPriceFromString(convertEuro);
            System.out.println(b);

    }


}
