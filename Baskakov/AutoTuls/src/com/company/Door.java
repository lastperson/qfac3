package com.company;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

/**
 * Created by user on 7/9/14.
 */
public class Door {
    private String Material;
    public String Color;
    private boolean isOpened;
    public Door(String Material, String Color, boolean isOpened){
        this.Material=Material;
        this.Color=Color;
        this.isOpened=isOpened;

    }


    public String WhatsMaterial() {
    return this.Material;
        }

    public void Open(){
        this.isOpened = true;
    }
public  void Close(){
    this.isOpened=false;
}

    public boolean isOpened(){
        return this.isOpened;
    }


}
