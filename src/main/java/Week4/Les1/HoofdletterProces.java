package Week4.Les1;

public class HoofdletterProces  implements OpmaakProces {


    public HoofdletterProces (){

    }

    @Override
    public String opmaak(String input) {
        return input.toUpperCase();
    }
}
