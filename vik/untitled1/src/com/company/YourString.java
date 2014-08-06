package com.company;

/**
 * Created by user on 7/11/14.
 */
public class YourString {
    int i = 0;
    int j = 0;
    private String yourString;

    private int yourStringLength() {
        return this.yourString.length();
    }

    public YourString(String yourString) {
        this.yourString = yourString;
    }

    public String getString() {
        return this.yourString;
    }

    public int aCount() {
        while (i < yourStringLength()) {
            if (yourString.charAt(i) == 'a') {
                j++;
            }
            i = i + 1;
        }
        return j;
    }

    public static void reverseString(String ys) {
        int k=0;
        int l=ys.length();
        while (k<ys.length()) {
            System.out.print(ys.charAt(l-1));k=k+1;l=l-1;
        }
    }
}
