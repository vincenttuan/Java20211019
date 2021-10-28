package day4;

public class SwitchDemo {

	public static void main(String[] args) {
		int day = 1;
		switch (day) {
			case 1:
				System.out.println("星期天");
				break;
			case 2:
				System.out.println("星期一");
				break;
			case 3:
				System.out.println("星期二");
				break;
			case 4:
				System.out.println("星期三");
				break;
			case 5:
				System.out.println("星期四");
				break;
			case 6:
				System.out.println("星期五(小周末)");
				break;
			case 7:
				System.out.println("星期六(周末)");
				break;	
			default: // 不在上述 case 中的值
				System.out.println("day 輸入錯誤");
		}	
			

	}

}
