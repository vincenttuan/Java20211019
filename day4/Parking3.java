package day4;

import java.util.Scanner;

public class Parking3 {

	public static void main(String[] args) {
		int area = 37;
		System.out.println(area + "=>" + Integer.toBinaryString(area));
		System.out.print("�п�J�z�R������m: ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int car = (int)Math.pow(2, no);
		if((area & car) > 0) { // ����O�_�Ө��즳�z���R��
			System.out.println("���쥿�T, ���¥��{");
			area -= car;
			System.out.println(area + "=>" + Integer.toBinaryString(area));
		} else {
			System.out.println(no + " ������S������~");
		}
	}

}
