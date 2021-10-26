package day3;

public class Hello2 {

	public static void main(String[] args) {
		// 前序遞增 / 後序遞增
		int age = 10;
		int var = ++age; // int var = age++;
		System.out.println(age);
		System.out.println(var);
		
		int x = 100;
		System.out.println(x++);
		System.out.println(x);
	}

}
