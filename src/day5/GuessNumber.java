package day5;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		Random r = new Random();
		// 請在 1~10 之間猜一個數字
		int ans = r.nextInt(10) + 1;
		do {
			// 請使用者先猜, 再決定要不要繼續猜
			System.out.print("使用者請於 1 ~ 10 之間猜一個數字: ");
			Scanner scanner = new Scanner(System.in);
			int user_guess = scanner.nextInt();
			if(user_guess > ans) {
				System.out.println("使用者猜大了");
			} else if (user_guess < ans) {
				System.out.println("使用者猜小了");
			} else {
				System.out.println("使用者猜對了");
				break;
			}
			System.out.println("請按下 enter 讓電腦來猜 ...");
			new Scanner(System.in).nextLine();
			// 請電腦後猜, 再決定要不要繼續猜
			System.out.print("電腦請於 1 ~ 10 之間猜一個數字: ");
			int pc_guess = r.nextInt(10) + 1;
			System.out.println(pc_guess);
			if(pc_guess > ans) {
				System.out.println("電腦猜大了");
			} else if (pc_guess < ans) {
				System.out.println("電腦猜小了");
			} else {
				System.out.println("電腦猜對了");
				break;
			}
		} while(true);
		
		System.out.println("程式結束");

	}

}
