package basic;

import java.util.Scanner;

public class FinalExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double PI = 3.1415926;
		System.out.println("Բ����="+PI);
		System.out.println("������Բ�İ뾶��");
		double radius = scan.nextDouble();
//		System.out.println("Բ�İ뾶="+radius);
		double area = PI * radius * radius;
		System.out.println("Բ�����="+area);		
	}

}
