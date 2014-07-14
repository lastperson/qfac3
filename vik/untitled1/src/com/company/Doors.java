package com.company;

/**
 * Created by user on 7/9/14.
 */
public class Doors {
    private String mat;
    public String color;
    private boolean open;
    public String getmat(){return this.mat;}
    public void openDoor(){this.open=true;}
    public void closeDoor(){this.open=false;}
    public boolean dooStatusOpen(){return this.open;}
    public Doors(String mat, String color, boolean open) {
        this.mat=mat;
        this.color=color;
        this.open=open;
    }
    }
