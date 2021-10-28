package day4;

public class Parking {

	public static void main(String[] args) {
		int area = 37;
		System.out.println(area);
		// 列印時將 int 用二進位表示
		System.out.println(Integer.toBinaryString(area));
		// 指定車位
		int no = 3;
		int car = (int)Math.pow(2, no);
		// 停車
		area = area + car;
		System.out.println(area);
		System.out.println(Integer.toBinaryString(area));
		
	}

}
