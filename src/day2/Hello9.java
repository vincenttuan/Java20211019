package day2;

/*
 * �p���b Hero ���q�Ѳ��C�� 10 ���ɶR�i 10 �i
 * �p���b Hero ���q�Ѳ��C�� 11 ���ɽ�X 10 �i
 * �аݤp���ȤF�h�ֿ� ?
 * 1�i=1000�� 	
*/
public class Hello9 {

	public static void main(String[] args) {
		int buyPrice = 10;
		int buyAmount = 10 * 1000;
		int buyCost = buyPrice * buyAmount;
		System.out.printf("�R�i����: %,d\n", buyCost);
		int sellPrice = 11;
		int sellAmount = 10 * 1000;
		int sellValue = sellPrice * sellAmount;
		System.out.printf("��X����: %,d\n", sellValue);
		int profit = sellValue - buyCost;
		System.out.printf("�R����Q: %,d\n", profit);
	}

}
