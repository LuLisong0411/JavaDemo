/*
 * 三元运算符与if-else的区别:三元运算符可以减少代码的录入，结构更简单。
 * */
package basic;

public class Ternary {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("三元运算符与if-else的比较");
		System.out.println(IfElseMax(5,4));
		System.out.println(TernaryMax(8,9));
	}

	private static int TernaryMax(int i, int j) {
		// TODO 自动生成的方法存根
		return i > j? i:j;
	}

	private static int IfElseMax(int i, int j) {
		// TODO 自动生成的方法存根
		if (i > j) {
			return i;
		}else {
			return j;
		}
	}

}
