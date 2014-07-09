package com.company;


public class Tests {
    public static void main(String[] args){

        Door firstDoor = new Door("Metal", "Black", true);
        Door secondDoor = new Door("Wood", "Blue", false);
        Door thirdDoor = new Door("Iron", "Green", true);

        firstDoor.color = "White";
        secondDoor.open();

        System.out.println("Door 1: material - "
                + firstDoor.materialKind() + "; color - "
                + firstDoor.color + "; is door opened - "
                + firstDoor.isOpenedDoor() + ".");
        System.out.println("Door 2: material - "
                + secondDoor.materialKind() + "; color - "
                + secondDoor.color + "; is door opened - "
                + secondDoor.isOpenedDoor() + ".");
        System.out.println("Door 3: material - "
                + thirdDoor.materialKind() + "; color - "
                + thirdDoor.color + "; is door opened - "
                + thirdDoor.isOpenedDoor() + ".");


    }
}
