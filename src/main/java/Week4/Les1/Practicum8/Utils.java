package Week4.Les1.Practicum8;

import java.text.DecimalFormat;

public class Utils {

    private static String pattern = "0.";
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static  DecimalFormat eenDecimal ;

    public static String euroBedrag(double bedrag) {
        return df.format(bedrag);
    }
        public static String euroBedrag(double bedrag, int precisie) {
            String s = "";
            if(precisie != 0){
                //replace the precisie value to the String
                for (int i = 0 ; i < precisie ; i++){
                    s +=  "0";
                }
                pattern += s ;
                eenDecimal = new DecimalFormat(pattern);
            }

            return eenDecimal.format(bedrag);
        }

}
