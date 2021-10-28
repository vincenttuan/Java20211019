package day4;

import java.util.Random;

public class WhileDemo {

	public static void main(String[] args) {
		
		Random r = new Random(); // 隨機數物件
		
		while(true) {
			int n = r.nextInt(100); // 0~99
			System.out.println(n);
			if(n == 0) {
				break;
			}
		}
		
		

	}

}
