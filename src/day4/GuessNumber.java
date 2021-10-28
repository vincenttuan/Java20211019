package day4;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int ans = 57;
		int min = 0;
		int max = 100;
		
		while(true) {
			System.out.printf("請在 %d ~ %d 之間猜一數字: ", min, max);
			Scanner sc = new Scanner(System.in);
			int guess = sc.nextInt();
			// 檢查是在合理範圍
			if(guess >= max || guess <= min) {
				System.out.println("數字超過範圍, 請重新輸入");
				continue;
			}
			
			if(guess < ans) {
				min = guess;
			} else if(guess > ans) {
				max = guess;
			} else {
				System.out.println("恭喜答對了");
				break;
			}
		}
		
		System.out.println("程式結束");
		
		
	}

}
