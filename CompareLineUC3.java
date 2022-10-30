package com.bridgelabz.day8_linecomparision;

public class CompareLineUC3 extends EqualCheckUC2 {

    @Override
    public void EqualCheck() {
        super.EqualCheck();

        if (linelenght1 == linelenght2) {
            System.out.println("Both line are equal");
        } else if (linelenght1 > linelenght2) {
            System.out.println("Line 1 is greater");
        } else {
            System.out.println("Line 2 is greater");
        }


    }

    public static void main(String[] args) {
        CompareLineUC3 obj = new CompareLineUC3();
        obj.EqualCheck();
    }
}
