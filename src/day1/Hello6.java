package day1;

public class Hello6 {

	public static void main(String[] args) {
		double r = 345;
		System.out.println(r);
		double pi = Math.PI;
		System.out.println(pi);
		// �D�ꭱ�n�P�y��n�U�O�h�� ?
		double area = Math.pow(r, 2) * pi;
		double volumn = 4.0 / 3 * Math.pow(r, 3) * pi;
		System.out.printf("�b�|: %f �ꭱ�n: %f �y��n: %f\n", r, area, volumn);
		System.out.printf("�b�|: %,.1f �ꭱ�n: %,.1f �y��n: %,.1f\n", r, area, volumn);
	
	}

}
