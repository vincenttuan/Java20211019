package day1;

public class Hello3 {
	public static void main(String[] args) {
		// 加減乘除
		// 台積電股票價格 614 小明買了 3 張, 問花了多少錢 ?
		System.out.println(614 * 3 * 1000);
		// 使用 printf 進行資料格式化
		// 例如: 1842000 變成 1,842,000
		// 格式化整數: %d, 浮點數(有小數的數值): %f
		System.out.printf("%,d\n", (614 * 3 * 1000));
		//-----------------------------------------------
		// 使用變數來存放計算好的資料
		// int 指的就是整數型態, cost 指的是變數名稱
		int cost = 614 * 3 * 1000;
		System.out.println(cost);
		System.out.printf("%,d\n", cost);
	}
}
