package day4;

import java.util.Scanner;

public class Parking4 {

	public static void main(String[] args) {
		int area = 37;
		System.out.println(area + "=>" + Integer.toBinaryString(area));
		Scanner sc = new Scanner(System.in);
		System.out.print("想停車請輸入:1 想移車請輸入:2 ==> ");
		int x = sc.nextInt(); // 使用者的決定
		System.out.print("請輸入車位 ==> ");
		int no = sc.nextInt(); // 使用者輸入車位
		int car = (int)Math.pow(2, no);
		switch (x) {
			case 1: // 停車
				if((area & car) == 0) {
					System.out.println(no + " 號車位可停車, 謝謝光臨");
					area += car;
					System.out.println(area + "=>" + Integer.toBinaryString(area));
				} else {
					System.out.println(no + " 號車位不可停車");
				}
				break;
			case 2: // 移車
				if((area & car) > 0) {
					System.out.println(no + " 號車位可移車, 謝謝光臨");
					area -= car;
					System.out.println(area + "=>" + Integer.toBinaryString(area));
				} else {
					System.out.println(no + " 號車位沒車, 無車可移");
				}
				break;	
		}
	}
}
