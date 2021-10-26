package day3;

import java.util.Scanner;

public class Hello6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高(cm): ");
		double h = sc.nextDouble();
		System.out.print("請輸入體重(kg): ");
		double w = sc.nextDouble();
		// 計算 bmi
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("身高: %.1f cm\n", h);
		System.out.printf("體重: %.1f kg\n", w);
		System.out.printf("BMI: %.2f kg\n", bmi);
		// 判斷 bmi
		// bmi > 23 過胖, bmi <= 18 過瘦, 其他範圍是正常
		if(bmi > 23) {
			System.out.println("過胖");
		} else if (bmi <= 18) {
			System.out.println("過瘦");
		} else {
			System.out.println("正常");
		}
		
	}

}
