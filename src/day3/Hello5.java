package day3;

import java.util.Scanner;

public class Hello5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�п�J������: ");
		int chinese = sc.nextInt(); // ���o�ϥΪ̩ҿ�J��������
		System.out.print("�п�J�ƾǤ���: ");
		int math = sc.nextInt(); // ���o�ϥΪ̩ҿ�J���ƾǤ���
		// �p���`��
		int sum = chinese + math;
		double avg = (double)sum/2;
		System.out.printf("���: %d\n", chinese);
		System.out.printf("�ƾ�: %d\n", math);
		System.out.printf("�`��: %d\n", sum);
		System.out.printf("����: %.1f\n", avg);
	}

}
