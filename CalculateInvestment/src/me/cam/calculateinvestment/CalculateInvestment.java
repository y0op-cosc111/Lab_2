package me.cam.calculateinvestment;

import java.util.Scanner;

/**
 * Author: Cameron Janssen
 * Acknowledgements: None
 * Purpose: Calculates the future
 * investment when given initial values.
 */
public class CalculateInvestment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // future = amount * (1 + monthlyRate)^(numberOfYears * 12)

        System.out.println("Enter the initial investment: ");
        double initial = scanner.nextDouble();
        System.out.println("Enter the annual interest rate (percentage): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.println("Enter the number of years of the investment: ");
        double numberOfYears = scanner.nextDouble();

        double futureValue = initial * Math.pow((1 + (annualInterestRate/100)/12), numberOfYears * 12);
        System.out.println("Your future investment will be: " + futureValue);
    }
}