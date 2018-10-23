/*
 * 不借助第三者实现两个变量值的交换
 * */
package outwardBound;

import java.util.Scanner;

public class ExchangeVariable {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);				//创建扫描器，用于获取输入值
		System.out.println("请输入变量A的值");
		long A = scan.nextInt();							//接收第一个变量值
		System.out.println("请输入变量B的值");
		long B = scan.nextLong();							//接收第二个变量值
		System.out.println("变量A = "+A+"\t变量B = "+B);
		System.out.println("\t执行变量交换.....");		
		//执行变量交换
		A = A ^ B;				
		B = B ^ A;	
		A = A ^ B;
		System.out.println("A = "+A+"\tB = "+B);
		scan.close();								//释放scan资源
		
	}
	
}
