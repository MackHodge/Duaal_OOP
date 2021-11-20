package Week2.Les1.Practicum3B;

//Constructor should throw an  illegalargumentException
//when the radius is smaller or equal to 0

public class Cirkel {

    private int radius ;
    private int xPositie ;
    private int yPositie ;


    public Cirkel(int x , int y , int  radius){
        xPositie = x ;
        yPositie = y ;
        this.radius = radius;

    }

    public void throwEx(){
        if(this.radius <= 0){

        }

        }

    public String toString(){

        return "";
    }
}
