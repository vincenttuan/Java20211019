package day3;

public class Hello9 {

	public static void main(String[] args) {
		System.out.println(5 << 2);
		System.out.println(5 << 34); // 超過或等於 32 時會取 %32 的值(餘數)
		// 所以 5 << 34 相當於 5 << 2
		System.out.println(5 >> 66);
	}

}
