package day4;

import java.util.Scanner;

public class Parking5 {

	public static void main(String[] args) {
		int area = 0b100101;
		
		parking: // ���j��]�w�@�ӦW�r (loop label)
		while (true) {
			System.out.println("���쪬�p => " + Integer.toBinaryString(area));
			Scanner sc = new Scanner(System.in);
			System.out.print("1:���� 2:���� 0:Exit ==> ");
			int x = sc.nextInt();
			System.out.print("�п�ܨ��� ==> ");
			int no = sc.nextInt();
			int car = (int)Math.pow(2, no);
			switch(x) {
				case 1: // ����
					if((area & car) == 0) {
						System.out.printf("���\: ���l�b���� %d ������\n", no);
						area += car;
					} else {
						System.out.printf("����: ���� %d ���������i��\n", no);
					}
					break;
				case 2: // ����
					if((area & car) > 0) {
						System.out.printf("���\: ���l�b���� %d �����X\n", no);
						area -= car;
					} else {
						System.out.printf("����: ���� %d ���S�����i��\n", no);
					}
					break;
				case 0: // Exit
					break parking;
				default:
					System.out.println("��ܿ��~, �Э��s��� !");
			}
		}
		System.out.println("�{������");
	}

}
