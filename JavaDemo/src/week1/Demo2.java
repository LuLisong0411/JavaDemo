package week1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ҫ¼��˭����Ϣ��1.С�� 2.С�� 3.С�");
		int flag = scan.nextInt();
		if (flag == 1) {
			System.out.println("������С�������");
			int stuAge = scan.nextInt();
			System.out.println("������С��ĳɼ�");
			double stuScore = scan.nextDouble();
			System.out.println("С��������ǣ�" + stuAge + ";�ɼ��ǣ�" + stuScore);
		} else if (flag == 2) {
			System.out.println("������С�յ�����");
			int stuAge = scan.nextInt();
			System.out.println("������С�յĳɼ�");
			double stuScore = scan.nextDouble();
			System.out.println("С�յ������ǣ�" + stuAge + ";�ɼ��ǣ�" + stuScore);
		} else if (flag == 3) {
			System.out.println("������С�������");
			int stuAge = scan.nextInt();
			System.out.println("������С��ĳɼ�");
			double stuScore = scan.nextDouble();
			System.out.println("С��������ǣ�" + stuAge + ";�ɼ��ǣ�" + stuScore);
		} else {

			System.out.println("������0-2�����֣�");
		}

	}

}
