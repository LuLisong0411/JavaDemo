/*
 * ������������ʵ����������ֵ�Ľ���
 * */
package outwardBound;

import java.util.Scanner;

public class ExchangeVariable {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);				//����ɨ���������ڻ�ȡ����ֵ
		System.out.println("���������A��ֵ");
		long A = scan.nextInt();							//���յ�һ������ֵ
		System.out.println("���������B��ֵ");
		long B = scan.nextLong();							//���յڶ�������ֵ
		System.out.println("����A = "+A+"\t����B = "+B);
		System.out.println("\tִ�б�������.....");		
		//ִ�б�������
		A = A ^ B;				
		B = B ^ A;	
		A = A ^ B;
		System.out.println("A = "+A+"\tB = "+B);
		scan.close();								//�ͷ�scan��Դ
		
	}
	
}
