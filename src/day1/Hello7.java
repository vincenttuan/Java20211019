package day1;

public class Hello7 {

	public static void main(String[] args) {
		// 小明身高:170cm, 體重:60kg, 求 bmi 值 (取到小數點第二位)
		double h = 170;
		double w = 60;
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("小明身高: %.1f cm, 體重: %.1f kg, bmi: %.1f \n", h, w, bmi);
	}

}
