package Week4.Les1.Practicum8;

import java.util.Locale;

public class App {
    public static void main (String[] args){

                  //1. Maak een BedrijfsInventaris-object aan met voldoende budget.
                BedrijfsInventaris UhInv = new BedrijfsInventaris("Hogeschool Utrecht" ,10000.0);
                BedrijfsInventaris UUInv = new BedrijfsInventaris("Utrecht University" ,100000000.00);
                 //2. Maak 2 Computer-objecten aan, die exact dezelfde eigenschappen hebben.
                Computer pc1 = new Computer("MacBook Pro 13-inch","e9:66:84:5e:be:e4",1299.00,2021);
                Computer pc2 = new Computer("MacBook Pro 13-inch","e9:66:84:5e:be:e4",1299.00,2021);

                //3.Doe dit ook voor Fiets en Auto.
                Fiets f1 = new Fiets("Paris C7 HMB",1999.00,2018,39);
                Fiets f2 = new Fiets("Paris C7 HMB",1999.00,2018,39);

                Auto au = new Auto("Tesla 3",49980,2017,"UH-001-B");
                Auto au1 = new Auto("Tesla 3",49980,2017,"UH-001-B");

                //4.Maak ook nog een auto, fiets en computer met andere eigenschappen.
                Auto au2 = new Auto("Tesla X",111990,2015,"UH-002-C");
                Fiets f3 = new Fiets("Paris C7+ HMB",2299.00,2020,39);
                Computer pc3 = new Computer("MacBook Pro 14-inch","e9:64:24:2e:ye:e9",1999.00,2021);
                Computer pc4 = new Computer("MacBook Pro 14-inch","e9:63:24:6e:Xe:e9",2499.00,2021);

                //5.Probeer alle objecten aan de bedrijfsinventaris toe te voegen.

            UhInv.schafAan(pc1);
            UhInv.schafAan(pc2);
            UhInv.schafAan(f1);
            UhInv.schafAan(f1);
            UhInv.schafAan(f2);
            UhInv.schafAan(au);
            UhInv.schafAan(au1);
            UhInv.schafAan(au2);
            UhInv.schafAan(f3);
            UhInv.schafAan(pc3);
            UhInv.schafAan(pc4);

        UUInv.schafAan(pc1);
        UUInv.schafAan(pc2);
        UUInv.schafAan(f1);
        UUInv.schafAan(f1);
        UUInv.schafAan(f2);
        UUInv.schafAan(au);
        UUInv.schafAan(au1);
        UUInv.schafAan(au2);
        UUInv.schafAan(f3);
        UUInv.schafAan(pc3);
        UUInv.schafAan(pc4);


                //6.Print de BedrijfsInventaris
                  System.out.println(UhInv.getBedrijfnaam().toUpperCase());
                  System.out.println(UhInv);

                   System.out.println("\n"+UUInv.getBedrijfnaam().toUpperCase());
                   System.out.println(UUInv);




    }
}
