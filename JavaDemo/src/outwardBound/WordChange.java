package outwardBound;

import java.util.Scanner;

public class WordChange {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入需要转换的字母：");
		char word = scan.next().charAt(0);
		if (word >= 'A' && word <= 'Z') {
			word += 32;
			System.out.println("大写"+(char)(word-32)+"转换成了"+word);
		}else if (word >= 'a' && word <= 'z') {
			word -= 32;
			System.out.println("小写"+(char)(word+32)+"转换成了"+word);
		}else {
			System.out.println("输入格式不对，请重新输入!");
		}
	}
}
