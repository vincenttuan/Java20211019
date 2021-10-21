package day2;

/*
 * 小明在 Hero 公司股票每股 10 元時買進 10 張
 * 小明在 Hero 公司股票每股 11 元時賣出 10 張
 * 請問小明賺了多少錢 ?
 * 1張=1000股
 * 手續費: 1.425‰ (買賣都要算, 不足20元以20元計算) -> 公式: 股票價值 * 手續費
 * 交易稅: 3‰ (賣出才要算) -> 公式: 股票價值 * 交易稅
*/

public class Hello10 {

	public static void main(String[] args) {
		final double FEE = 0.001425;
		final double TAX = 0.003;
		double buyPrice = 10;
		int buyAmount = 10 * 1000;
		double buyCost = buyPrice * buyAmount;
		buyCost = buyCost + (buyCost * FEE);
		System.out.printf("買進成本: %,.1f\n", buyCost);
		
		double sellPrice = 11;
		int sellAmount = 10 * 1000;
		double sellValue = sellPrice * sellAmount;
		sellValue = sellValue - (sellValue * FEE) - (sellValue * TAX);
		System.out.printf("賣出價值: %,.1f\n", sellValue);
		
		double profit = sellValue - buyCost;
		System.out.printf("買賣獲利: %,.1f\n", profit);
	}

}
