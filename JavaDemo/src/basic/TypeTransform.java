/*
 * 
 * �Զ�����ת����ǿ������ת��
 * 
 * */
package basic;

public class TypeTransform {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		byte a= 50;
		char b = 'G';
		short c = 12345;
		int d = 6789;
		long e = 10000L;
		float f = 3.1415926F;
		double g = 3.1415926;
		//�����͵������͵��Զ�ת��
		System.out.println("�ۼ�byte���ڣ�"+a);
		System.out.println("�ۼ�char���ڣ�"+(a+b));
		System.out.println("�ۼ�short����:"+(a+b+c));
		System.out.println("�ۼ�int����:"+(a+b+c+d));
		System.out.println("�ۼ�long����:"+(a+b+c+d+e));
		System.out.println("�ۼ�float����:"+(a+b+c+d+e+f));
		System.out.println("�ۼ�double����:"+(a+b+c+d+e+f+g));
		//�����͵������͵�ǿ��ת��
		System.out.println("��longǿ��ת��Ϊint:"+(int)e);			
		System.out.println("��intǿ��ת��Ϊshort:"+(short)e);		//�����͵������͵�ת���ᶪʧ����
		System.out.println("��doubleǿ��ת��Ϊint:"+(int)g);			//ʵ����������ת��������С������
		System.out.println("��shortǿ��ת��Ϊchar:"+(char)c);		//�������ַ�����ת������ȡ��Ӧ������ַ�
	}

}
