package day1;

public class Hello3 {
	public static void main(String[] args) {
		// �[���
		// �x�n�q�Ѳ����� 614 �p���R�F 3 �i, �ݪ�F�h�ֿ� ?
		System.out.println(614 * 3 * 1000);
		// �ϥ� printf �i���Ʈ榡��
		// �Ҧp: 1842000 �ܦ� 1,842,000
		// �榡�ƾ��: %d, �B�I��(���p�ƪ��ƭ�): %f
		System.out.printf("%,d\n", (614 * 3 * 1000));
		//-----------------------------------------------
		// �ϥ��ܼƨӦs��p��n�����
		// int �����N�O��ƫ��A, cost �����O�ܼƦW��
		int cost = 614 * 3 * 1000;
		System.out.println(cost);
		System.out.printf("%,d\n", cost);
	}
}
