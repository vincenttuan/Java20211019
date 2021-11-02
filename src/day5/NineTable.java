package day5;

public class NineTable {

	public static void main(String[] args) {
		int m = 9;
		
		for(int x=1;x<=m;x++) {
			for (int y = 1; y <= m; y++) {
				System.out.printf("%d*%d=%-2d ", x, y, (x * y));
			}
			System.out.println();
		}
		
		
		

	}

}
