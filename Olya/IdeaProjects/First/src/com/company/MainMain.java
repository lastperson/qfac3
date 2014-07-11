package com.company;

/**
 * Created by Oleg on 09.07.2014.
 */
public class MainMain {
    public static void main(String[] args){
        Door a = new Door("Iron", "Brown", true);
        Door b = new Door("Wood", "Brown", false);
        Door c = new Door("MDF", "Red", true);
        Door d = new Door("MDF", "Red", true);


        System.out.println(a.printable()); //позволяет прописать метод для сокращения кода, метод прописан в Door.java
        System.out.println(b.printable());
        System.out.println(c.printable());
        /*System.out.println("Материал двери " + a.materialType() + " Цвет двери " + a.color + " Состояние двери " + a.isOpen() );
        System.out.println("Материал двери " + b.materialType() + " Цвет двери " + b.color + " Состояние двери " + b.isOpen() );
        System.out.println("Материал двери " + c.materialType() + " Цвет двери " + c.color + " Состояние двери " + c.isOpen() );*/

        System.out.println(Door.isSameColor(d,d,a,b)); //нужно передавать в определенном порядке


    }




}
