/*
 * 
 * 		�߼��������ʹ��
 * 
 * */
package basic;

import java.util.Scanner;

public class LogicOperater {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,temp;					//����������ͱ���
		System.out.print("������a��ֵ��");				//��ʾ�û�����
		a = scan.nextInt();							//�Ӽ�������ֵ
		System.out.print("������b��ֵ��");
		b = scan.nextInt();
		System.out.print("������c��ֵ��");
		c = scan.nextInt();		
		if (a >= b && a >= c) {						//�Ƚ�a�Ƿ�Ϊ���ֵ
			temp = a;								//��a��ֵ��temp
		}else if (!(b < a) && !(b < c)) {
			temp = b;
		}else {
			temp = c;
		}
		System.out.println("Max = "+temp);
	}

}
