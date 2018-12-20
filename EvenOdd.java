package com.stackroute.unittest.pe1;


public class EvenOdd {
    public String evenOdd(int num) {

        if (((num % 2) == 0) && (num > 20 && num < 30))
        {
            return "jerry";
        }

        else if(((num % 2) != 0) && (num > 20 && num < 30))
        {
            return "tom";
        }
        else
        {
            return "";
        }

        }
    }



