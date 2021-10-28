package day4;

import java.util.Scanner;

public class Parking3 {

	public static void main(String[] args) {
		int area = 37;
		System.out.println(area + "=>" + Integer.toBinaryString(area));
		System.out.print("請輸入您愛車的位置: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int car = (int)Math.pow(2, no);
		if((area & car) > 0) { // 檢驗是否該車位有您的愛車
			System.out.println("車位正確, 謝謝光臨");
			area -= car;
			System.out.println(area + "=>" + Integer.toBinaryString(area));
		} else {
			System.out.println(no + " 號車位沒有車喔~");
		}
	}

}
