package day4;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int ans = 57;
		int min = 0;
		int max = 100;
		
		while(true) {
			System.out.printf("�Цb %d ~ %d �����q�@�Ʀr: ", min, max);
			Scanner sc = new Scanner(System.in);
			int guess = sc.nextInt();
			// �ˬd�O�b�X�z�d��
			if(guess >= max || guess <= min) {
				System.out.println("�Ʀr�W�L�d��, �Э��s��J");
				continue;
			}
			
			if(guess < ans) {
				min = guess;
			} else if(guess > ans) {
				max = guess;
			} else {
				System.out.println("���ߵ���F");
				break;
			}
		}
		
		System.out.println("�{������");
		
		
	}

}
