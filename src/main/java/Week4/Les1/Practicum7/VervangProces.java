package Week4.Les1.Practicum7;

public class VervangProces implements OpmaakProces{
    private String oud;
    private String nieuw;


    public VervangProces(String oud, String nieuw) {
        this.oud = oud;
        this.nieuw = nieuw;
    }

    /**
     * //if string contain this input vervang met niuwe String
     * @param input
     * @return
     */

    @Override
    public String opmaak(String input) {
        String s = "";
        if(input.contains(oud)){
         s += input.replace(oud,nieuw);
        }

        return s;
    }
}
