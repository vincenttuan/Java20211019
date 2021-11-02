package day5;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) throws InterruptedException {
		int current_floor = 1;
		int max = 7;
		int min = 1;
		do {
			System.out.printf("目前電梯在 %d 樓, 請輸入樓層 %d~%d: ", current_floor, min, max);
			Scanner scanner = new Scanner(System.in);
			int target_floor = scanner.nextInt();
			// 判斷樓層數字使否在 min ~ max 範圍內
			if(target_floor < min || target_floor > max) {
				continue;
			}
			// 判斷上樓還是下樓 ?
			String upOrDown = "";
			if(target_floor > current_floor) {
				upOrDown = "上樓";
				// current_floor 往 target_floor 目標邁進 ----------------
				System.out.printf("電梯%s ", upOrDown);
				while(current_floor <= target_floor) {
					Thread.sleep(1000); // 1000ms = 1 秒
					System.out.print((current_floor++) + " ");
				}
				System.out.println();
				//-----------------------------------------------------
			} else if (target_floor < current_floor) {
				upOrDown = "下樓";
				// current_floor 往 target_floor 目標邁進 ----------------
				System.out.printf("電梯%s ", upOrDown);
				while(current_floor >= target_floor) {
					Thread.sleep(1000); // 1000ms = 1 秒
					System.out.print((current_floor--) + " ");
				}
				System.out.println();
				//-----------------------------------------------------
			} else {
				continue; // 重新執行選擇
			}
			// 樓層校準
			current_floor = target_floor;
			
		} while(true);
		

	}

}
