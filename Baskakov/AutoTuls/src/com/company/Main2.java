package com.company;

/**
 * Created by user on 7/9/14.
 */
public class Main2 {
    public static void main(String[] args) {
    Door a = new Door("Metal","Red", true);
    Door b = new Door("Paper","Black", false);
    Door c = new Door("Wood","Orange", false);

        a.Color = "Yellow";
        b.Color = "Black";
        c.Color="Yellow";
        a.Close();
        b.Open();

        System.out.println(Door.correctcolor(a,b,c));

        System.out.println(Door.useee(a,b,c));



        System.out.println("Door a : Material-" + a.WhatsMaterial()
                + ", Color - " + a.Color+
        ", isOpened -" + a.isOpened());



        System.out.println("Door b : Material-" + b.WhatsMaterial()
                + ", Color - " + b.Color+
                ", isOpened -" + b.isOpened());

        System.out.println("Door c : Material-" + c.WhatsMaterial()
                + ", Color - " + c.Color+
                ", isOpened -" + c.isOpened());

        int[] Y =  Pirate.coun("asdasdasdsd");


        System.out.println(Y[0] +"  " + Y[1]);

        System.out.println(Pirate.coun2("adss"));

        System.out.println(Pirate.djo("abc"));

        System.out.println(Pirate.djo("abc"));

        System.out.println(Pirate.pol("aortY", 'o'));


    }




}
