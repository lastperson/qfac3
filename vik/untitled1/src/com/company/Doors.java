package com.company;

/**
 * Created by user on 7/9/14.
 */
public class Doors {
    private String mat;
    public String color;
    private boolean open;


    public String getmat() {
        return this.mat;
    }

    public static int doorsCount=0;
    public String doorsCount(){return doorsCount+" doors created";}

    public void openDoor() {
        this.open = true;
    }

    public void closeDoor() {
        this.open = false;
    }

    public boolean doorStatusOpen() {
        return this.open;
    }

    public Doors(String mat, String color, boolean open) {
        this.mat = mat;
        this.color = color;
        this.open = open;
        doorsCount=doorsCount+1;
    }

    public String doorInfo() {
        return "made of: " + getmat() + ";  color: " + color + ";  status: " + open;
    }

    public static boolean sameColor(Doors first, Doors second) {return (first.color == second.color);}
}