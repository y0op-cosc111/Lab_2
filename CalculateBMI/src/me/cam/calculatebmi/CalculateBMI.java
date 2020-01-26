package me.cam.calculatebmi;

import java.util.Scanner;

/**
 * Author: Cameron Janssen
 * Acknowledgements: None
 * Purpose: Calculates the BMI when
 * given weight and height.
 */
public class CalculateBMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in pounds:");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in inches:");
        double height = scanner.nextDouble();

        double weightKilo = weight * 0.45359237;
        double heightMeter = height * 0.0254;

        double BMI = weightKilo / (heightMeter * heightMeter);

        System.out.println("Your BMI is: " + BMI);
    }
}