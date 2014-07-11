package com.company;

/**
 * Created by Oleg on 09.07.2014.
 */
public class Door {
    private String material;
    public String color;
    private boolean isOpen;

    public Door(String material, String color, boolean isOpen){ //specify variable for new classes (this. is current object)
        this.material = material;
        this.color = color;
        this.isOpen = isOpen;
    }


    public String materialType() { //процедуре ставить типа параметры () обязательно
        return this.material;
    }
    public void OPenDoor(){ //void когда ничего не возвращает, подходит для true and false
        this.isOpen = true; //this is current object

    }

    public void CloseDoor(){
        this.isOpen = false;

    }

    public boolean isOpen(){
        return this.isOpen;

    }
    public String printable(){
        return "Материал - " + material + " , Цвет " + color + " Состояние двери " + isOpen();
    }

    public static boolean isSameColor(Door g, Door l, Door o, Door s) {
        if (g.color != l.color) {

            return false;

        }

        else if (o.color == s.color) {
            return true;
        }
         return false;



    }


}
