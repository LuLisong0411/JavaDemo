/*
 * ��Ԫ�������if-else������:��Ԫ��������Լ��ٴ����¼�룬�ṹ���򵥡�
 * */
package basic;

public class Ternary {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("��Ԫ�������if-else�ıȽ�");
		System.out.println(IfElseMax(5,4));
		System.out.println(TernaryMax(8,9));
	}

	private static int TernaryMax(int i, int j) {
		// TODO �Զ����ɵķ������
		return i > j? i:j;
	}

	private static int IfElseMax(int i, int j) {
		// TODO �Զ����ɵķ������
		if (i > j) {
			return i;
		}else {
			return j;
		}
	}

}
