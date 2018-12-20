import java.util.*;
public class Dynamic {
    public static void main(String args[]) {
        System.out.println("enter a num");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0,i;
        int c[]=new int[n];
        for(i=0;i<n;i++)
        {
            c[i]=s.nextInt();
            sum=sum+c[i];
        }
        System.out.println(sum);

    }
}


