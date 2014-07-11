package com.company;

/**
 * Created by Oleg on 11.07.2014.
 */
public class MyClass {
    public static void main(String[] args){
    String a;
    int n;
    int count = 0;



    public static int isCount(String a){
        int count = 0;
        int i = 0;


        while (i != 10)
            if (a.charAt(0) == 'a'){
                return (count + 1);
                System.out.println(i);
                i++;

            }
       if (count > 0) {
           return (isCount(a));
       }
    }



    }
}
