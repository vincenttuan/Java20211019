package day3;

import java.util.Scanner;

public class Hello6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J����(cm): ");
		double h = sc.nextDouble();
		System.out.print("�п�J�魫(kg): ");
		double w = sc.nextDouble();
		// �p�� bmi
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("����: %.1f cm\n", h);
		System.out.printf("�魫: %.1f kg\n", w);
		System.out.printf("BMI: %.2f kg\n", bmi);
		// �P�_ bmi
		// bmi > 23 �L�D, bmi <= 18 �L�G, ��L�d��O���`
		if(bmi > 23) {
			System.out.println("�L�D");
		} else if (bmi <= 18) {
			System.out.println("�L�G");
		} else {
			System.out.println("���`");
		}
		
	}

}
