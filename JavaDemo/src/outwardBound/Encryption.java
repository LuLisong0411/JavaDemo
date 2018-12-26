/*
 *      实现输入字符的加密解密
 * */

package outwardBound;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("请输入一个英文字符或解密字符串");
		String password = scanner.nextLine();       //获取用户输入
		char [] array = password.toCharArray();		//获取字符数组
		//遍历数组
		for(int i = 0; i < array.length; i++) {
			array[i] = (char) (array[i]^20000);		//对每个数组元素进行异或运算
		}
		System.out.println("加密或解密结果如下：");
		System.out.println(new String(array));		//输出密钥
		scanner.close();							//释放scanner资源
	}

}
