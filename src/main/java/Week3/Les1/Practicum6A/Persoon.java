package Week3.Les1.Practicum6A;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Persoon {
    private String name ;
    private double budget;

    private ArrayList<Game> mijnGames = new ArrayList();

    private String pattern = "0.00";
    private DecimalFormat decimalFormat = new DecimalFormat(pattern);

    public Persoon(String Name, int bud) {
        this.name = Name;
        this.budget = bud;
    }

    public ArrayList<Game> getMijnGames() {
        return mijnGames;
    }


    /**
     * If person budget is les than the game price && and if i dont already
     * own the game return true or the game is the same true
     * @param g game object
     * @return true if enough funds and the game does not exist
     */
    public boolean koop(Game g) {
        boolean t ;
        if (g != null && this.budget > g.huidigeWaarde() && !mijnGames.contains(g) ) {
                this.budget -= g.huidigeWaarde();
                mijnGames.add(g);
                return true;
        }
        return false;
    }

    /**
     * If game is not owned verkoop returns true
     * @param gameToSell
     * @param koper
     * @return
     */

    public boolean verkoop(Game gameToSell, Persoon koper) {

            if(mijnGames.contains(gameToSell) && koper.budget >= gameToSell.getDiscoutPrijs()) {
                koper.budget -= gameToSell.getDiscoutPrijs();
                koper.mijnGames.add(gameToSell);
                mijnGames.remove(gameToSell);
                budget += gameToSell.getDiscoutPrijs();
                return true;
        }
        return false;

    }

    //
    private String printArrayListItems(){
        String t = " " ;
        for (Game game:mijnGames) {
            t += game.toString();
        }
          return t ;
        }

    @Override
    public String toString() {
        String s = ""+this.name +" heeft een budget van " +decimalFormat.format(this.budget)+" en bezit de volgende games:\n"+ printArrayListItems()+"";

        return s;
    }
}
