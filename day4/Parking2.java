package day4;

import java.util.Scanner;

public class Parking2 {

	public static void main(String[] args) {
		int area = 37;
		System.out.println(area + " => " + Integer.toBinaryString(area));
		System.out.print("�п�J����: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int car = (int)Math.pow(2, no);
		if((area & car) == 0) { // ����O�_�i�H���� ?
			System.out.println(no + " ������i�H����");
			area += car;
			System.out.println(area + " => " + Integer.toBinaryString(area));
		} else {
			System.out.println(no + " �����줣�i�H����");
		}
	}

}
