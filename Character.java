import java.util.*;
public class Character {
    public static void main(String args[]) {
        System.out.println("enter a num");
        Scanner s = new Scanner(System.in);
        char n = s.next().charAt(0);
        if(n>=65&&n<=90)
        {
            System.out.println("Capital letter");
        }
        else if(n>=97&&n<=122)
        {
            System.out.println("small letter");
        }
        else if(n>=48&&n<=57)
        {
            System.out.println("number");
        }
        else if(n>=32&&n<=126)
        {
            System.out.println("special symbol");
        }
    }
}
