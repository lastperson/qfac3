package com.company;

/**
 * Created by user on 7/14/14.
 */
public class Someclass {
    public static String getstr (String nnnn){
        int q = nnnn.length();
        String mmmm="";
        int b;
        for(b=q-1; b>=0;b--)
        {mmmm = mmmm + nnnn.charAt(b);}
        return mmmm;

    }
    public static String dellchars(String qqqq, Character q){
       String wwww="";
        int e=0;
        while(e<qqqq.length()){
            if(qqqq.charAt(e)!=q){
                wwww=wwww+qqqq.charAt(e);


            }e++;
        }
    return wwww;
    }
}
