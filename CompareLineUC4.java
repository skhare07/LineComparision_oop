package com.bridgelabz.day8_linecomparision;

public class CompareLineUC4 extends EqualCheckUC2{

    public void compareTo(double linelenght1, double linelenght2)
    {
        if (linelenght1 == linelenght2) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (linelenght1 > linelenght2) {
            System.out.println("Line 1 is greater than to Line 2");
        } else {
            System.out.println("Line 2 is greater than to Line 1");
        }

    }

    public static void main(String[] args) {
        CompareLineUC4 obj = new CompareLineUC4();
        obj.EqualCheck();
        obj.compareTo(obj.linelenght1,obj.linelenght2);

    }

}
