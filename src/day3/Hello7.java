package day3;

public class Hello7 {

	public static void main(String[] args) {
		// &&(�u����), &(�@�뫬) AND �B��l
		// ||(�u����), |(�@�뫬) OR �B��l
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
