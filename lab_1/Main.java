package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Task1(1)
        
        System.out.println("Enter numbers:");
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        float num3 = in.nextFloat();
        float x = (num1 + num2 + num3) / 3;
        System.out.print("Average value: ");
        System.out.println(x);
        System.out.printf("%.0f", x);

/*
        //Task2(9)
        System.out.println("Enter number:");
        Scanner in = new Scanner(System.in);
        int A, x, y;
        A = in.nextInt();
        x = A * A;//А у степені 2
        System.out.println(x);
        y = x * A;//А у степені 3
        System.out.println(y);
        x = y * x;//А у степені 5
        System.out.println(x);
        y = x * x;//А у степені 10
        System.out.println(y);
        y = y * x;//А у степені 15
        System.out.println(y);
        */

        /*
        //Task3(14)
        Scanner in = new Scanner(System.in);
        double k1, k2;//катети
        k1 = in.nextDouble();
        k2 = in.nextDouble();
        double h = Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2));//теорема Піфагора
        double H = k1 * k2 / h;//формула висоти

        System.out.println(h);
        System.out.println(H);
        */
/*
        //Task4(19)
        Scanner in = new Scanner(System.in);
        double a, b, c, d;//сторони чотирикутника
        double diahonal;//діагональ
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();
        diahonal = in.nextDouble();
        double p1 = (a + b + diahonal) / 2;
        double s1 = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - diahonal));//формула Герона
        double p2 = (c + d + diahonal) / 2;
        double s2 = Math.sqrt(p1 * (p1 - c) * (p1 - d) * (p1 - diahonal));//формула Герона
        double S = s1 + s2;//площа чотирикутника
        System.out.printf("%.2f",S);*/

    }
}
