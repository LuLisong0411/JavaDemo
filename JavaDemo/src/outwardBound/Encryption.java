/*
 *      ʵ�������ַ��ļ��ܽ���
 * */

package outwardBound;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("������һ��Ӣ���ַ�������ַ���");
		String password = scanner.nextLine();       //��ȡ�û�����
		char [] array = password.toCharArray();		//��ȡ�ַ�����
		//��������
		for(int i = 0; i < array.length; i++) {
			array[i] = (char) (array[i]^20000);		//��ÿ������Ԫ�ؽ����������
		}
		System.out.println("���ܻ���ܽ�����£�");
		System.out.println(new String(array));		//�����Կ
		scanner.close();							//�ͷ�scanner��Դ
	}

}
