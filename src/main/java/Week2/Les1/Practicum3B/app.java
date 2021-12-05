package Week2.Les1.Practicum3B;

public class app {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);

        //Ik denkt dat : de applicatie tijdens uitvoeren stopt
        //omdat we hebben tog een exception in de constructor die
        //ckeck op radius 0 of kleiner dan 0
    }
}

