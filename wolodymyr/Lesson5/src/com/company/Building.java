package com.company;

/**
 * Created by user on 7/14/14.
 */
public class Building {
   public Door  door1;
   public Door door2;
   private static int count;
   Building(){
       door1=new Door("wodden", "black", true);
       door1=new Door("wodden", "black", true);
       count+=2;

    }
    public void makeNewDor(String name){
        Door dor3=new Door("wodden", "black", true);
        count++;

    }
    public static void  getCount(){
        System.out.println(count);
    }
}
