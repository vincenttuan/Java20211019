package day4;

public class Parking {

	public static void main(String[] args) {
		int area = 37;
		System.out.println(area);
		// �C�L�ɱN int �ΤG�i����
		System.out.println(Integer.toBinaryString(area));
		// ���w����
		int no = 3;
		int car = (int)Math.pow(2, no);
		// ����
		area = area + car;
		System.out.println(area);
		System.out.println(Integer.toBinaryString(area));
		
	}

}
