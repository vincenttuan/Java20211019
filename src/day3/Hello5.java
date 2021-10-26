package day3;

import java.util.Scanner;

public class Hello5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入國文分數: ");
		int chinese = sc.nextInt(); // 取得使用者所輸入的國文分數
		System.out.print("請輸入數學分數: ");
		int math = sc.nextInt(); // 取得使用者所輸入的數學分數
		// 計算總分
		int sum = chinese + math;
		double avg = (double)sum/2;
		System.out.printf("國文: %d\n", chinese);
		System.out.printf("數學: %d\n", math);
		System.out.printf("總分: %d\n", sum);
		System.out.printf("平均: %.1f\n", avg);
	}

}
