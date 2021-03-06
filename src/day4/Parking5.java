package day4;

import java.util.Scanner;

public class Parking5 {

	public static void main(String[] args) {
		int area = 0b100101;
		
		parking: // 給迴圈設定一個名字 (loop label)
		while (true) {
			System.out.println("車位狀況 => " + Integer.toBinaryString(area));
			Scanner sc = new Scanner(System.in);
			System.out.print("1:停車 2:移車 0:Exit ==> ");
			int x = sc.nextInt();
			if(x == 0) {
				break;
			}
			System.out.print("請選擇車位 ==> ");
			int no = sc.nextInt();
			if(no == 5) {
				System.out.println("這是管理員的專屬車位, 你不可選");
				continue; // 重新執行迴圈
			}
			if(no > 5) {
				System.out.println("車位號碼超過範圍, 請重新選擇");
				continue; // 重新執行迴圈
			}
			int car = (int)Math.pow(2, no);
			switch(x) {
				case 1: // 停車
					if((area & car) == 0) {
						System.out.printf("成功: 車子在車位 %d 號停妥\n", no);
						area += car;
					} else {
						System.out.printf("失敗: 車位 %d 號有車不可停\n", no);
					}
					break;
				case 2: // 移車
					if((area & car) > 0) {
						System.out.printf("成功: 車子在車位 %d 號移出\n", no);
						area -= car;
					} else {
						System.out.printf("失敗: 車位 %d 號沒車不可移\n", no);
					}
					break;
				default:
					System.out.println("選擇錯誤, 請重新選擇 !");
			}
		}
		System.out.println("程式結束");
	}

}
