package day5;

// 借计耞
public class PrimeNumber {

	public static void main(String[] args) {
		int n = 4343;
		boolean check = true; // 琌琌借计
		for(int x = 2; x <= n/2; x++) {
			int mod = n%x;
			System.out.printf("%d %% %d = %d\n", n, x, mod);
			if(mod == 0) {
				check = false;
				break;
			}
		}
		
		System.out.printf("%d %s\n", n, check?"琌借计":"ぃ琌借计");
		//System.out.printf("%d %s\n", n, check==true?"琌借计":"ぃ琌借计");

	}

}
