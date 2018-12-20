import java.util.*;
public class Sort {
    public static void main(String args[]) {
        System.out.println("enter a num");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a=new int[100];
        int c=0,i,j,k,sum=0,h;
        while(n!=0)
        {
           j=n%10;
           a[c]=j;
           if((j%2)==0)
           {
               sum=sum+j;
           }
           n=n/10;
           c++;

        }
        for(i=0;i<c;i++)
        {
            for(k=i+1;k<c;k++)
            {
                if(a[i]<a[k])
                {
                 h=a[i];
                 a[i]=a[k];
                 a[k]=h;
                }
            }
        }

        System.out.println("sorted num in non-increasing order");
        for(int z=0;z<c;z++){
            System.out.print(a[z]);
        }
        System.out.println("sum of even numbers"+sum);
        if(sum<15)
        {
            System.out.println("true");
        }
    }
}