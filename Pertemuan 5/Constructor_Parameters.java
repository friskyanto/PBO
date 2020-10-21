package com.pbo;

public class Main {
    int x;

    public Main (int y){
        x = y;
    }
    public static void main (String[] args){
        Constructor_Parameters myObj = new Constructor_Parameters(5);
        System.out.println(myObj.x);
    }
}
