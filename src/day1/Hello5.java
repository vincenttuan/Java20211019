package day1;

public class Hello5 {

	public static void main(String[] args) {
		double r = 345;
		System.out.println(r);
		double pi = Math.PI;
		System.out.println(pi);
		// 求圓面積與球體積各是多少 ?
		double area = r * r * pi;
		double volumn = 4.0 / 3 * (r * r * r * pi);
		// 格式化整數 %d, 浮點數 %f
		System.out.printf("半徑: %f 圓面積: %f 球體積: %f\n", r, area, volumn);
		System.out.printf("半徑: %,.1f 圓面積: %,.1f 球體積: %,.1f\n", r, area, volumn);
		
	}

}
