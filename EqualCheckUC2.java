package com.bridgelabz.day8_linecomparision;

public class EqualCheckUC2 extends LineLenghtUC1 {
    double linelenght1,linelenght2;

    public void EqualCheck() {
        System.out.println("Line 1");
        linelenght1 = LenghtLine();
        System.out.println("Line 2");
        linelenght2 = LenghtLine();

        System.out.println("Lenght is line 1: "+linelenght1);
        System.out.println("Lenght is line 2: "+linelenght2);

        if (linelenght1 == linelenght2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

    public static void main(String[] args) {
        EqualCheckUC2 obj = new EqualCheckUC2();
        obj.EqualCheck();
    }

}
