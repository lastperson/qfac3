package com.company;

/**
 * Created by user on 7/11/14.
 */
public class Pirate {
    public  String  A;
    public boolean N;


    public static int coun(String I){
        int a = 0;
        int b= 0;

            while (I.length()>b) {
                if (I.charAt(b)=='a') {
                    a = a + 1;
                }
                b=b+1;
            }

        return a;



        //System.out.println("asdsadasd".charAt(0)=='a');
    }








}
