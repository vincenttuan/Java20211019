package day3;

public class Hello7 {

	public static void main(String[] args) {
		// &&(短路型), &(一般型) AND 運算子
		// ||(短路型), |(一般型) OR 運算子
		int score = 70;
		int point = 1;
		if(score >= 60 | ++point > 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println(point);
	}

}
