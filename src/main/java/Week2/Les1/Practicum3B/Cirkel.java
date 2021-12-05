package Week2.Les1.Practicum3B;

//Constructor should throw an  illegalargumentException
//when the radius is smaller or equal to 0

public class Cirkel {

    private int radius ;
    private int xPositie ;
    private int yPositie ;


    public Cirkel( int radius , int x , int y){
        xPositie = x ;
        yPositie = y ;
        if(radius <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }else  {
            this.radius = radius;
        }


    }

    public int getRadius() {
        return radius;
    }

    public int getxPositie() {
        return xPositie;
    }

    public int getyPositie() {
        return yPositie;
    }


    public String toString(){
        String s = "Cirkel ( "+getxPositie() +", "+getyPositie()+ " ) met radius: "+getRadius()+ "";
        return s;
    }
}
