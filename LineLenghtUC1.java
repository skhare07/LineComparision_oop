package com.bridgelabz.day8_linecomparision;

import java.util.Scanner;
class Point {
    int x1;   //co-ordinate x
    int x2;
    int y1;  //co-ordinate y
    int y2;

    double lenght;

    //Getter and Setter
    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }


}

public class LineLenghtUC1 {

    public static double LenghtLine() {
        Point obj = new Point();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X1");
        obj.setX1(scanner.nextInt());
        int x1 = obj.getX1();

        System.out.println("Enter X2");
        obj.setX2(scanner.nextInt());
        int x2 = obj.getX2();

        System.out.println("Enter Y1");
        obj.setY1((scanner.nextInt()));
        int y1 = obj.getY1();

        System.out.println("Enter Y2");
        obj.setY2((scanner.nextInt()));
        int y2 = obj.getY2();

        double x = Math.pow((x1 - x2), 2);
        double y = Math.pow((y1 - y2), 2);

        double lenght = Math.sqrt(x + y);

        return lenght;
    }

    public static void main(String[] args) {
        Point obj = new Point();
        double linelenght = LenghtLine();
        System.out.println("Lenght of line is " + linelenght);
    }
}
