package week1;

import java.util.Scanner;

public class Swith_if_else {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫѡ������֣�");
		int flag = scan.nextInt();
		// else_if
		// if(flag == 1) {
		// System.out.println("����1");
		// }else if(flag == 2) {
		// System.out.println("����2");
		// }else if(flag ==3) {
		// System.out.println("����3");
		// }else if(flag == 4) {
		// System.out.println("����4");
		// }else {
		// System.out.println("������1-4");
		// }
		// }
		switch (flag) {
		case 1:
			System.out.println("����1");
			break;
		case 2:
			System.out.println("����2");
			break;
		case 3:
			System.out.println("����3");
			break;
		case 4:
			System.out.println("����4");
			break;
		default:
			System.out.println("������1-4");
		}
	}
}
