package week1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入需要录入谁的信息【1.小红 2.小刚 3.小李】");
		int flag = scan.nextInt();
		if (flag == 1) {
			System.out.println("请输入小红的年龄");
			int stuAge = scan.nextInt();
			System.out.println("请输入小红的成绩");
			double stuScore = scan.nextDouble();
			System.out.println("小红的年龄是：" + stuAge + ";成绩是：" + stuScore);
		} else if (flag == 2) {
			System.out.println("请输入小刚的年龄");
			int stuAge = scan.nextInt();
			System.out.println("请输入小刚的成绩");
			double stuScore = scan.nextDouble();
			System.out.println("小刚的年龄是：" + stuAge + ";成绩是：" + stuScore);
		} else if (flag == 3) {
			System.out.println("请输入小李的年龄");
			int stuAge = scan.nextInt();
			System.out.println("请输入小李的成绩");
			double stuScore = scan.nextDouble();
			System.out.println("小李的年龄是：" + stuAge + ";成绩是：" + stuScore);
		} else {

			System.out.println("请输入0-2的数字！");
		}

	}

}
