/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mylab211.Week1;

/**
 *
 * @author LENOVO LEGION
 */
public class Calculate {

    public Calculate() {
    }

    void findNumbers(double numbers) {
        if(isPerfectSquare(numbers)){
            System.out.println(numbers + " is a square numbers");
            return;
        }if(numbers % 2 != 0){
            System.out.println(numbers+ " is odd numbers");
        }else System.out.println(numbers +" is even numbers");
    }

    boolean isPerfectSquare(double n) {
        if (n < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public void superlativeEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinite solutions");
            } else {
                System.out.println("The equation has no solutions");
            }
        } else {
            double x = -b / a;
            System.out.println("The solution of superlative equation: " + x);
        }
        findNumbers(a);
        findNumbers(b);
    }

    public void quadraticEquation(double a, double b, double c) {
        if (a == 0) {
            System.out.println("This is superlative equation");
            superlativeEquation(b, c);
        }
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("The equation has no solutions");
        }
        if (delta == 0) {
            double s1 = (-b) / (2 * a);
            System.out.println("The one double solution is: " + s1);
        } else {
            double s2 = (-b + Math.sqrt(delta)) / (2 * a);
            double s3 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two solution is: " + s2 + " and " + s3);
        }
        findNumbers(a);
        findNumbers(b);
        findNumbers(c);
    }
}
