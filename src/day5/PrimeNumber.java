package day5;

// ��ƧP�_
public class PrimeNumber {

	public static void main(String[] args) {
		int n = 4343;
		boolean check = true; // �O�_�O���
		for(int x = 2; x <= n/2; x++) {
			int mod = n%x;
			System.out.printf("%d %% %d = %d\n", n, x, mod);
			if(mod == 0) {
				check = false;
				break;
			}
		}
		
		System.out.printf("%d %s\n", n, check?"�O���":"���O���");
		//System.out.printf("%d %s\n", n, check==true?"�O���":"���O���");

	}

}
