package week1;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������û�����");
		String userName = scan.next();
		System.out.println("�������û����룺");
		String password = scan.next();
		// ������λ��֤��
			int code1 = (int) (Math.random() * 10);
			int code2 = (int) (Math.random() * 10);
			int code3 = (int) (Math.random() * 10);
			int code4 = (int) (Math.random() * 10);
			String code = "" + code1 + code2 + code3 + code4;
			System.out.println("��֤�룺��" + code + "��");
		if (userName.equals("admin") && password.equals("1234")) {
			System.out.println("��������֤�룺");
			String myCode = scan.next();
			if (myCode.equals(code)) {
				System.out.println("��½�ɹ�������");
				System.out.println("������������䣺");
				int userAge = scan.nextInt();
				if (userAge >= 18) {
					System.out.println("�����˿�����8Сʱ");
				} else {
					System.out.println("δ������ֻ����2Сʱ");
				}
			}else {
				System.out.println("��֤����󣡣���");
			}

		} else {
			System.out.println("�û������������!!!");
		}
	}
}
