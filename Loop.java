import java.util.*;
public class Loop {
    public static void main(String args[]) {
        System.out.println("enter a num");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i,j;
        for(i=1;i<n+1;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(i);
            }
        }
    }
}
