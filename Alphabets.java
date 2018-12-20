import java.util.*;
public class Alphabets {
    public static void main(String args[]) {
        System.out.println("enter the word");
        Scanner s=new Scanner(System.in);
        String st=s.next();
        char ch[]={'a','e','i','o','u','A','E','I','O','U'};
        int j;
        for(int k=0;k<st.length();k++)
        {
            if(st.charAt(k)>=65&&st.charAt(k)<=90||st.charAt(k)>=97&&st.charAt(k)<=122)
            {
               j=0;
               if(st.charAt(k)==ch[j])
               {
                   System.out.print("vowel ");
                   j++;
               }
               else
                   {
                   System.out.print("consonant ");
                   }

            }
            else
            {
                System.out.print("invalid");
            }
        }
    }
}
