package day5;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {

	public static void main(String[] args) {
		Random r = new Random();
		// �Цb 1~10 �����q�@�ӼƦr
		int ans = r.nextInt(10) + 1;
		do {
			// �ШϥΪ̥��q, �A�M�w�n���n�~��q
			System.out.print("�ϥΪ̽Щ� 1 ~ 10 �����q�@�ӼƦr: ");
			Scanner scanner = new Scanner(System.in);
			int user_guess = scanner.nextInt();
			if(user_guess > ans) {
				System.out.println("�ϥΪ̲q�j�F");
			} else if (user_guess < ans) {
				System.out.println("�ϥΪ̲q�p�F");
			} else {
				System.out.println("�ϥΪ̲q��F");
				break;
			}
			System.out.println("�Ы��U enter ���q���Ӳq ...");
			new Scanner(System.in).nextLine();
			// �йq����q, �A�M�w�n���n�~��q
			System.out.print("�q���Щ� 1 ~ 10 �����q�@�ӼƦr: ");
			int pc_guess = r.nextInt(10) + 1;
			System.out.println(pc_guess);
			if(pc_guess > ans) {
				System.out.println("�q���q�j�F");
			} else if (pc_guess < ans) {
				System.out.println("�q���q�p�F");
			} else {
				System.out.println("�q���q��F");
				break;
			}
		} while(true);
		
		System.out.println("�{������");

	}

}
