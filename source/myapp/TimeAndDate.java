// source code is decompiled from a .class file using FernFlower decompiler
package myapp;

import java.util.Date;
import java.io.PrintStream;;

public class TimeAndDate {
    public TimeAndDate() {

    }
    
    //entry point
    public static void main(String[] args) {
        PrintStream var10000 = System.out;
        Date var10001 = new Date();
        var10000.println("The current time and date is " + String.valueOf(var10001));
    }
}
