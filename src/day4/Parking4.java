package day4;

import java.util.Scanner;

public class Parking4 {

	public static void main(String[] args) {
		int area = 37;
		System.out.println(area + "=>" + Integer.toBinaryString(area));
		Scanner sc = new Scanner(System.in);
		System.out.print("�Q�����п�J:1 �Q�����п�J:2 ==> ");
		int x = sc.nextInt(); // �ϥΪ̪��M�w
		System.out.print("�п�J���� ==> ");
		int no = sc.nextInt(); // �ϥΪ̿�J����
		int car = (int)Math.pow(2, no);
		switch (x) {
			case 1: // ����
				if((area & car) == 0) {
					System.out.println(no + " ������i����, ���¥��{");
					area += car;
					System.out.println(area + "=>" + Integer.toBinaryString(area));
				} else {
					System.out.println(no + " �����줣�i����");
				}
				break;
			case 2: // ����
				if((area & car) > 0) {
					System.out.println(no + " ������i����, ���¥��{");
					area -= car;
					System.out.println(area + "=>" + Integer.toBinaryString(area));
				} else {
					System.out.println(no + " ������S��, �L���i��");
				}
				break;	
		}
	}
}
