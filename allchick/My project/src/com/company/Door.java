package com.company;

/**
 * Created by user on 7/9/14.
 */
public class Door {
    private String material;
    public String color;
    private boolean isOpened;

    public Door(String material, String color, boolean isOpened){
        this.material = material;
        this.color = color;
        this.isOpened = isOpened;
    };

    public String materialKind(){
        return this.material;
    }

    public boolean isOpenedDoor(){
        return this.isOpened;
    }

    public void open(){
        this.isOpened = true;
    }

    public void close(){
        this.isOpened = false;
    }

}
