import java.util.*;
public class Repeat {
    public static void main(String args[]) {
        System.out.println("enter the word");
        Scanner s = new Scanner(System.in);
        String st = s.next();
        int n=s.nextInt();
        int i,j,a;
        char b;
        a=st.length();
        System.out.print(st);
        for(j=0;j<n;j++)
        {
            for(i=a-n;i<a;i++)
            {
                System.out.print(st.charAt(i));
            }
        }

    }
}
