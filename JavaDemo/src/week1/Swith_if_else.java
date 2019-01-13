package week1;

import java.util.Scanner;

public class Swith_if_else {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要选择的数字：");
		int flag = scan.nextInt();
		// else_if
		// if(flag == 1) {
		// System.out.println("这是1");
		// }else if(flag == 2) {
		// System.out.println("这是2");
		// }else if(flag ==3) {
		// System.out.println("这是3");
		// }else if(flag == 4) {
		// System.out.println("这是4");
		// }else {
		// System.out.println("请输入1-4");
		// }
		// }
		switch (flag) {
		case 1:
			System.out.println("这是1");
			break;
		case 2:
			System.out.println("这是2");
			break;
		case 3:
			System.out.println("这是3");
			break;
		case 4:
			System.out.println("这是4");
			break;
		default:
			System.out.println("请输入1-4");
		}
	}
}
