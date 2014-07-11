package com.company;

/**
 * Created by user on 7/9/14.
 */
public class Main1 {
    public static void main(String[] args) {
        Door study = new Door("Wooden", "Blue", true);
        Door home = new Door("Iron", "White", true);
        Door atWork = new Door("Plastic", "White", false);
        study.color="Yellow";
        home.Close();


        System.out.println(atWork.printVersion());
        System.out.println(Door.isEqual(atWork, home));
        System.out.println(home.isEqualnotst(atWork, home) );


        System.out.println("Дверь1: материол "+study.getMatter()+", цвет "+study.color+", откыта ли " +study.isOpened());
        System.out.println("Дверь2: материол "+home.getMatter()+", цвет "+home.color+", откыта ли " +home.isOpened());
        System.out.println("Дверь3: материол "+atWork.getMatter()+", цвет "+atWork.color+", откыта ли " +atWork.isOpened());

    }
}
