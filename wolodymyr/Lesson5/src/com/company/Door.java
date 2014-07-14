package com.company;

/**
 * Created by user on 7/14/14.
 */
public class Door {
    private String matter;
    public String color;
    private boolean isOpened;
    public Door(String matter, String color, boolean isOpened){
        this.matter=matter;
        this.color=color;
        this.isOpened = isOpened;


    }
    public String getMatter (){
        return this.matter;
    }
    public void Open(){
        this.isOpened = true;
    }
    public void Close(){
        this.isOpened = false;
    }
    public boolean isOpened (){
        return this.isOpened;

    }
    public  String printVersion(){
        return "Материал - " + this.matter + ", цвет - " + this.color + ", откритаЛи - " + this.isOpened;
    }
    public static boolean isEqual(Door a, Door b){
        return a.color==b.color;
    }
    public boolean isEqualnotst(Door a, Door b){
        return a.color==b.color;
    }
}
