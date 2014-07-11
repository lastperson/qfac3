package com.company;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

/**
 * Created by user on 7/9/14.
 */
public class Door {
    private String Material;
    public String Color;
    private boolean isOpened;

    public Door(String Material, String Color, boolean isOpened) {
        this.Material = Material;
        this.Color = Color;
        this.isOpened = isOpened;

    }


    public String WhatsMaterial() {
        return this.Material;
    }

    public void Open() {
        this.isOpened = true;
    }

    public void Close() {
        this.isOpened = false;
    }

    public boolean isOpened() {
        return this.isOpened;
    }


    public String printable() {
    return "Material - " + this.Material + ", Color - " + this.Color + ", isOpened" + this.isOpened;
    }

    public static boolean correctcolor (Door a,Door b,Door c){
        return a.Color==b.Color && b.Color!=c.Color && c.Color!=a.Color;
    }

    public  static String useee(Door a, Door b, Door c){
        return a.Color+b.Color+c.Color+a.Color;
    }


}
