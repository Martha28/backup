package com.stackroute.unittest.pe1;

public class Palindrome2{
    public String checkPalindrome(int num)
    {
        int r,temp,sum=0;
        temp=num;
        while(num>0){
            r=num%10;  //getting remainder
            sum=(sum*10)+r;
            num=num/10;


        }
        if(temp==sum) {
            if (sum > 25) {
                return "palindrome number and greater than 25";
            }
            else {
                return "palindrome number and less than 25";
            }
        }
        else
            return "not palindrom";
    }
}