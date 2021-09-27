package com.Practise;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Temperature;
        System.out.println("Enter the Temperature in Fahrenheit:");
        Temperature = sc.nextDouble();
        double WindSpeed;
        System.out.println("Enter the Speed of the Wind:");
        WindSpeed = sc.nextDouble();
        double W = Math.pow(WindSpeed, 0.16);
        double WindChill = 35.74 + 0.6215 * Temperature + (0.4275 * Temperature - 35.75) * W;
        System.out.println("WindChill of the given Speed and Fahrenheit is = " +WindChill);
    }
}