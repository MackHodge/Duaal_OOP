package Week4.Les1;

public class VervangProces implements OpmaakProces{
    private String oud;
    private String nieuw;


    public VervangProces(String oud, String nieuw) {
        this.oud = oud;
        this.nieuw = nieuw;
    }

    @Override
    public String opmaak(String input) {

        return input;
    }
}
