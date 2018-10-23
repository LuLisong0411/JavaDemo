/*
 * 
 * 		逻辑运算符的使用
 * 
 * */
package basic;

import java.util.Scanner;

public class LogicOperater {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,temp;					//声明多个整型变量
		System.out.print("请输入a的值：");				//提示用户输入
		a = scan.nextInt();							//从键盘输入值
		System.out.print("请输入b的值：");
		b = scan.nextInt();
		System.out.print("请输入c的值：");
		c = scan.nextInt();		
		if (a >= b && a >= c) {						//比较a是否为最大值
			temp = a;								//将a赋值给temp
		}else if (!(b < a) && !(b < c)) {
			temp = b;
		}else {
			temp = c;
		}
		System.out.println("Max = "+temp);
	}

}
