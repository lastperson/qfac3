package com.company;


public class Tests {

    public static String rewriteText(String someText) {

        int textLength = someText.length();
        String rewrittenText = "";
        int i;

        for (i = textLength - 1; i != -1; i--) {
            rewrittenText = rewrittenText + someText.charAt(i);
        }

        someText = rewrittenText;
        return someText;
    }

    public static String deleteSymbol(String someText, char symbolForDelete){

        int textLength = someText.length();
        String rewrittenText = "";
        int i=0;

        do {
            boolean isSymbolEqual = symbolForDelete == someText.charAt(i);
            if (isSymbolEqual == false)
                rewrittenText = rewrittenText + someText.charAt(i);
            i++;
        } while (i != textLength);

        return rewrittenText;
    }

    public static void main(String[] args){

        String textForChanging = "Text was typed.";
        char symbolForDelete = 'e';

        System.out.println(rewriteText(textForChanging));
        System.out.println(deleteSymbol(textForChanging, symbolForDelete));

        Door newFirstDoor = new Door("metal", "black", true);
        Door newSecondDoor = new Door("wood", "white", false);
        Door newThirdDoor = new Door("wood", "green", false);

        Building newCreatedBuilding = new Building(newFirstDoor, newSecondDoor);
        Building newCreatedBuilding2 = new Building(new Door("wood", "black", true), new Door("wood", "black", true));
        Building newCreatedBuilding3 = new Building(new Door("wood", "blue", true), newThirdDoor);
        Building newCreatedDefaultBuilding = new Building();

        System.out.println(Door.doorsQuantity);
        newCreatedBuilding.printDoorsInfo();
        newCreatedBuilding2.printDoorsInfo();
        newCreatedBuilding3.printDoorsInfo();
        newCreatedDefaultBuilding.printDoorsInfo();
    }
}
