package com.company;

/**
 * Created by user on 7/9/14.
 */
public class Main2 {
    public static void main(String[] args) {
        Doors a = new Doors("wood", "brown", true);
        Doors b = new Doors("steel", "green", true);
        Doors c = new Doors("glass", "void", false);
        Doors d = new Doors("glass", "void", false);
        a.color="black";
        b.closeDoor();
        //System.out.println("Door_1. made of:" + a.getmat()+";  color:"+a.color+";  status:"+a.doorStatusOpen());
        //System.out.println("Door_1. made of:" + b.getmat()+";  color:"+b.color+";  status:"+b.doorStatusOpen());
        //System.out.println("Door_1. made of:" + c.getmat()+";  color:"+c.color+";  status:"+c.doorStatusOpen());

        System.out.println(a.doorInfo());
        System.out.println(b.doorInfo());
        System.out.println(c.doorInfo());
        if (Doors.sameColor(a,d)){System.out.println("the same color doors");} else{System.out.println("different color doors");}
        System.out.println(a.doorsCount());
    }

}
