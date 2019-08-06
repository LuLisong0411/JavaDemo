package demo;
/*Java中的默认转换规则：
取值范围小的数据类型与取值大的数据类型进行运算时，
会先将小的数据类型转换成大的数据类型在进行计算*/

public class Demo_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//数据类型转换：“隐式转换”
		int x = 3;
		System.out.println(x);
		byte b = 4;
		x = x + b;
		System.out.println(x);
		
		/*int + byte
		 00000000 00000000 00000000 00000011  : 3
		 00000100 : 4
	=>   00000000 00000000 00000000 00000100  : 4
	 	 00000000 00000000 00000000 00000111  : 7
		 */
		
	}
	

}
