/*
 *		浮点数型数据的取值 
 * */
package outwardBound;

public class FloatDouble {

	public static void main(String[] args) {
		
		//赋系统的最大最小值
		float Float_Max = java.lang.Float.MAX_VALUE;
		float Float_Min = java.lang.Float.MIN_VALUE;
		double Double_Max = java.lang.Double.MAX_VALUE;
		double Double_Min = java.lang.Double.MIN_VALUE;
		System.out.println("单精度浮点数最大值为："+Float_Max);
		System.out.println("单精度浮点数最小值为："+Float_Min);
		System.out.println("双精度浮点数最大值为："+Double_Max);
		System.out.println("双精度浮点数最小值为："+Double_Min);
	}

}
