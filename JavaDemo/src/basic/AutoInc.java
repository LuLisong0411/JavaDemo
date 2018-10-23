/*
 * 
 * 		自增自减运算符的使用
 * 
 * */
package basic;

public class AutoInc {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i = 1;
		System.out.println("i1 = "+(i++));		//i++先赋值在运算
		System.out.println("i = "+i);			
		System.out.println("i2 = "+(++i));		//++i先运算在赋值
		System.out.println("i = "+i);
		System.out.println("i3 = "+(i--));		//i--先赋值在运算
		System.out.println("i = "+i);
		System.out.println("i4 = "+(--i));		//--i先运算在赋值
	}

}
