package Week1.les1.opdracht1;

import javax.xml.transform.stream.StreamSource;

public class App {
    public static void main(String[] args){
        System.out.println("Opdracht 1");
       countToTen();
        System.out.println("Opdracht 2");
        countToTen2();
        System.out.println("Opdracht 3");
        random();
        System.out.println("Opdracht 4");
        sumUpTo780();
        System.out.println("Opdracht 5");
        printS();

    }

        public static void countToTen (){
        for (int i = 1 ; i  <= 10 ;i++ ){
            System.out.println(i);
        }


    }
    public static void countToTen2(){
        int i = 1;
        while (i <=10) {
            System.out.println(i);
            i++;
        }
    }

    public static void random() {

        for(int i = 1 ; i <= 10; i++){
            System.out.println(Math.random());
        }
    }

    public static void sumUpTo780 () {
        int sum = 0 ;
        for(int i = 0 ; i <= 39 ; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    private static void printS() {
        for (int i = 0; i < 2; i++) {
            if (true) {
                System.out.println("s");
                System.out.println("ss");
            }
        }
    }


    }




