package day5;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) throws InterruptedException {
		int current_floor = 1;
		int max = 7;
		int min = 1;
		do {
			System.out.printf("�ثe�q��b %d ��, �п�J�Ӽh %d~%d: ", current_floor, min, max);
			Scanner scanner = new Scanner(System.in);
			int target_floor = scanner.nextInt();
			// �P�_�Ӽh�Ʀr�ϧ_�b min ~ max �d��
			if(target_floor < min || target_floor > max) {
				continue;
			}
			// �P�_�W���٬O�U�� ?
			String upOrDown = "";
			if(target_floor > current_floor) {
				upOrDown = "�W��";
				// current_floor �� target_floor �ؼ��ڶi ----------------
				System.out.printf("�q��%s ", upOrDown);
				while(current_floor <= target_floor) {
					Thread.sleep(1000); // 1000ms = 1 ��
					System.out.print((current_floor++) + " ");
				}
				System.out.println();
				//-----------------------------------------------------
			} else if (target_floor < current_floor) {
				upOrDown = "�U��";
				// current_floor �� target_floor �ؼ��ڶi ----------------
				System.out.printf("�q��%s ", upOrDown);
				while(current_floor >= target_floor) {
					Thread.sleep(1000); // 1000ms = 1 ��
					System.out.print((current_floor--) + " ");
				}
				System.out.println();
				//-----------------------------------------------------
			} else {
				continue; // ���s������
			}
			// �Ӽh�շ�
			current_floor = target_floor;
			
		} while(true);
		

	}

}
