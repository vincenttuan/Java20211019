package day1;

public class Hello4 {
	public static void main(String[] args) {
		// 雞 + 兔 = 35隻
		// 雞腳 + 兔腳 = 94隻
		// 求雞兔各有幾隻 ?
		// 數學運算子: + - * /
		int amount = 35;
		int feet = 94;
		int chicken = ((amount * 4) - feet) / 2;
		int rabbit = amount - chicken;
		System.out.printf("雞加兔有 %d 隻 雞腳加兔腳有 %d 隻\n", amount, feet);
		System.out.printf("雞: %d 兔: %d\n", chicken, rabbit);
	}
}
