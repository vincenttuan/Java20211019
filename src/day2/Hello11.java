package day2;

/*
 * 小明在 Hero 公司股票每股 5 元時買進 1 張
 * 請問小明要付出多少手續費 ?
 * 1張=1000股
 * 手續費: 1.425‰ (買賣都要算, 不足20元以20元計算) -> 公式: 股票價值 * 手續費
*/

public class Hello11 {

	public static void main(String[] args) {
		final double FEE = 0.001425;
		double buyPrice = 5;
		int buyAmount = 1 * 1000;
		double buyCost = buyPrice * buyAmount; // 買進成本(不含手續費)
		System.out.printf("買進成本(不含手續費) = %.1f\n", buyCost);
		// 買進的手續費
		double buy_fee = buyCost * FEE;
		System.out.printf("原手續費 = %.1f\n", buy_fee);
		// 手續費不足20元以20元計算
		buy_fee = (buy_fee < 20) ? 20 : buy_fee;
		System.out.printf("調整後手續費 = %.1f\n", buy_fee);
		// 買進成本
		buyCost = buyCost + buy_fee; // 買進成本(含手續費)
		System.out.printf("買進成本(含手續費) = %.1f\n", buyCost);
		
	}

}
