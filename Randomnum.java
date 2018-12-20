import java.util.*;
import java.util.Random;
public class Randomnum {
    public static void main(String args[]){
        Random x=new Random();
        int y=x.nextInt(10);
        Scanner s=new Scanner(System.in);
        int guess;
        boolean t=false;
        while(t==false){
            System.out.println("enter the number between 1 and 50");
            guess=s.nextInt();
            if(guess==y)
            {
                System.out.println("Number guessed matches the original number");
            }
            if(guess>y)
            {
                System.out.println("Number guessed greater than the original number");
            }
            if(guess<y)
            {
                System.out.println("Number guessed lesser than the original number");
            }
        }

    }
}
