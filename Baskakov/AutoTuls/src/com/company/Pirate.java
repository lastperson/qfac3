package com.company;

/**
 * Created by user on 7/11/14.
 */
public class Pirate {
    public String A;
    public boolean N;


    public static int[] coun(String I) {
        int a = 0;
        int b = 0;
        int[] c = new int[]{0, 0};

        while (I.length() > b) {
            if (I.charAt(b) == 'a') {
                a = a + 1;
            }
            b = b + 1;
        }


        c[0] = a;
        c[1] = b;
        return c;


        //System.out.println("asdsadasd".charAt(0)=='a');
    }


    public static String coun2(String Y) {

        String P = Y + Y + Y;

        return P;


    }

    public static String djo(String B) {

        int a = B.length() - 1;
 String t = "";

        while (true){
            char o;
            o = B.charAt(a);

            t=t+o;
            a = a -1;

            if (a==-1){
                break;
            }


        }

        return t;

            }

    public static String pol(String X,char Y) {

        int a=0;

        String t = "";
        while (true) {

            char o=X.charAt(a);
            if (o!=Y){
                t=t+o;
                            }

           a = a+1;

            if (X.length()==a){
                break;
            }
        }
        return t;
    }
}















