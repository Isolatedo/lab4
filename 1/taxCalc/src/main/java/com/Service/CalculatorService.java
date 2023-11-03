package com.Service;

public class CalculatorService {
    public static double calculate(double income) {
        double tax = 0;
        if (income <= 36000) {
            tax = income * 0.03;
        } else if (income <= 144000) {
            tax = (income - 36000) * 0.1 + 2520;
        } else if (income <= 300000) {
            tax = (income - 144000) * 0.2 + 16920;
        } else if (income <= 420000) {
            tax = (income - 300000) * 0.25 + 31920;
        } else if (income <= 660000) {
            tax = (income - 420000) * 0.3 + 52920;
        } else if (income <= 960000) {
            tax = (income - 660000) * 0.35 + 85920;
        } else {
            tax = (income - 960000) * 0.45 + 181920;
        }
        return tax;
    }
}
