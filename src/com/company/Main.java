package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào cân nặng: ");
        float weight = scanner.nextFloat();
        System.out.print("Nhập vào chiều cao: ");
        float height = scanner.nextFloat();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("Chỉ số BMI là %f",bmi);
        if(bmi < 18.5) {
            System.out.println("Underweight!!");
        } else if(bmi>=18.5 && bmi<25) {
            System.out.println("Normal");
        } else if(bmi>=25 && bmi<30) {
            System.out.println("Overweight");
        } else if(bmi>=30) {
            System.out.println("Obese");
        }
    }
}
