package day1;

public class Hello4 {
	public static void main(String[] args) {
		// �� + �� = 35��
		// ���} + �߸} = 94��
		// �D���ߦU���X�� ?
		// �ƾǹB��l: + - * /
		int amount = 35;
		int feet = 94;
		int chicken = ((amount * 4) - feet) / 2;
		int rabbit = amount - chicken;
		System.out.printf("���[�ߦ� %d �� ���}�[�߸}�� %d ��\n", amount, feet);
		System.out.printf("��: %d ��: %d\n", chicken, rabbit);
	}
}
