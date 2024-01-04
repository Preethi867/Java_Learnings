package com.udemy;

public class Main_class {
    public static void main(String[] args) {
        TouchScreenLaptop obj = new HPNotebook();
        TouchScreenLaptop obj1 = new DellNotebook();
        obj.click();
        obj.scroll();
        obj1.click();
        obj1.scroll();
    }
}
