package com.company;

/**
 * Created by user on 7/14/14.
 */
public class Building {
    public Door firstDoor;
    public Door secondDoor;

    public Building (Door firstDoor, Door secondDoor){
        this.firstDoor = firstDoor;
        this.secondDoor = secondDoor;
    }

    public Building (){
        Door firstDefaultDoor = new Door("hz", "red", false);
        Door secondDefaultDoor = new Door("hz", "red", true);
        this.firstDoor = firstDefaultDoor;
        this.secondDoor = secondDefaultDoor;
    }

    public void printDoorsInfo(){
        System.out.println("Material of first door is " + firstDoor.materialKind()
                + "; color of first door is " + firstDoor.color + ".");
        System.out.println("Material of second door is " + secondDoor.materialKind()
                + "; color of second door is " + secondDoor.color + ".");
    }
}
