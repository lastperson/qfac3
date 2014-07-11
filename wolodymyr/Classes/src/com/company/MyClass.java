package com.company;

/**
 * Created by user on 7/11/14.
 */
public class MyClass {

    public int getCoun_a(String cont){
        int a=0;
        int b=0;
        while (a<cont.length()){
        if(cont.charAt(a)=='a'){
            b++;
        }a++;}
        return b;

    }
    public String B(int H, String needadd){
        int i=0;
        String dddd="";
        for (i=0;i<H;i++){
            dddd=dddd+needadd;

        }

        return dddd;
    }
}
