package day1;

public class Hello7 {

	public static void main(String[] args) {
		// �p������:170cm, �魫:60kg, �D bmi �� (����p���I�ĤG��)
		double h = 170;
		double w = 60;
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("�p������: %.1f cm, �魫: %.1f kg, bmi: %.1f \n", h, w, bmi);
	}

}
