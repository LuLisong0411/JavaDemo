package outwardBound;

import java.util.Scanner;

public class WordChange {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ҫת������ĸ��");
		char word = scan.next().charAt(0);
		if (word >= 'A' && word <= 'Z') {
			word += 32;
			System.out.println("��д"+(char)(word-32)+"ת������"+word);
		}else if (word >= 'a' && word <= 'z') {
			word -= 32;
			System.out.println("Сд"+(char)(word+32)+"ת������"+word);
		}else {
			System.out.println("�����ʽ���ԣ�����������!");
		}
	}
}
