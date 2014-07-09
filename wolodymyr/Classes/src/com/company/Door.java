package com.company;

/**
 * Created by user on 7/9/14.
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
}



