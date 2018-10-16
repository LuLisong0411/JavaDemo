package basic;

import java.util.Scanner;

public class FinalExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double PI = 3.1415926;
		System.out.println("圆周率="+PI);
		System.out.println("请输入圆的半径：");
		double radius = scan.nextDouble();
//		System.out.println("圆的半径="+radius);
		double area = PI * radius * radius;
		System.out.println("圆的面积="+area);		
	}

}
