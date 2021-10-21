package day2;

/*
 * 小明在 Hero 公司股票每股 10 元時買進 10 張
 * 小明在 Hero 公司股票每股 11 元時賣出 10 張
 * 請問小明賺了多少錢 ?
 * 1張=1000股 	
*/
public class Hello9 {

	public static void main(String[] args) {
		int buyPrice = 10;
		int buyAmount = 10 * 1000;
		int buyCost = buyPrice * buyAmount;
		System.out.printf("買進成本: %,d\n", buyCost);
		int sellPrice = 11;
		int sellAmount = 10 * 1000;
		int sellValue = sellPrice * sellAmount;
		System.out.printf("賣出價值: %,d\n", sellValue);
		int profit = sellValue - buyCost;
		System.out.printf("買賣獲利: %,d\n", profit);
	}

}
