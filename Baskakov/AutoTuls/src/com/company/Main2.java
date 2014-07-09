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
        b.Color = "White";
        a.Close();
        b.Open();

        System.out.println("Door a : Material-" + a.WhatsMaterial()
                + ", Color - " + a.Color+
        ", isOpened -" + a.isOpened());



        System.out.println("Door b : Material-" + b.WhatsMaterial()
                + ", Color - " + b.Color+
                ", isOpened -" + b.isOpened());

        System.out.println("Door c : Material-" + c.WhatsMaterial()
                + ", Color - " + c.Color+
                ", isOpened -" + c.isOpened());




    }




}
