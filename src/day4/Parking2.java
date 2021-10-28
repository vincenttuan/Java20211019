package day4;

import java.util.Scanner;

public class Parking2 {

	public static void main(String[] args) {
		int area = 37;
		System.out.println(area + " => " + Integer.toBinaryString(area));
		System.out.print("請輸入車位: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int car = (int)Math.pow(2, no);
		if((area & car) == 0) { // 檢驗是否可以停車 ?
			System.out.println(no + " 號車位可以停車");
			area += car;
			System.out.println(area + " => " + Integer.toBinaryString(area));
		} else {
			System.out.println(no + " 號車位不可以停車");
		}
	}

}
