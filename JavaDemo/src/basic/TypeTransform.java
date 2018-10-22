/*
 * 
 * 自动类型转换和强制类型转换
 * 
 * */
package basic;

public class TypeTransform {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte a= 50;
		char b = 'G';
		short c = 12345;
		int d = 6789;
		long e = 10000L;
		float f = 3.1415926F;
		double g = 3.1415926;
		//低类型到高类型的自动转换
		System.out.println("累加byte等于："+a);
		System.out.println("累加char等于："+(a+b));
		System.out.println("累加short等于:"+(a+b+c));
		System.out.println("累加int等于:"+(a+b+c+d));
		System.out.println("累加long等于:"+(a+b+c+d+e));
		System.out.println("累加float等于:"+(a+b+c+d+e+f));
		System.out.println("累加double等于:"+(a+b+c+d+e+f+g));
		//高类型到低类型的强制转换
		System.out.println("把long强制转换为int:"+(int)e);			
		System.out.println("把int强制转换为short:"+(short)e);		//高类型到低类型的转换会丢失数据
		System.out.println("把double强制转换为int:"+(int)g);			//实数到整数的转换将舍弃小数部分
		System.out.println("把short强制转换为char:"+(char)c);		//整数到字符串的转换将获取对应编码的字符
	}

}
