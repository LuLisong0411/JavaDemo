package week1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		//д������
		String stuName= "tom";
		int stuAge = 18;
		double stuScore = 80.5;
		System.out.println("ѧ��������"+stuName+";ѧ�����䣺"+stuAge+";�ɼ��ǣ�"+stuScore);
		//����̨������Ϣ
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ��������");
		String stuName1 = scan.next();
		System.out.println("������ѧ�����䣺");
		int stuAge1 = scan.nextInt();
		System.out.println("������ѧ���ɼ���");
		double stuScore1 = scan.nextDouble();
		System.out.println("ѧ��������"+stuName1+";ѧ�����䣺"+stuAge1+";�ɼ��ǣ�"+stuScore1);
		double scoreTotal = stuScore + stuScore1;
		double scoreAvg = scoreTotal/2;
		System.out.println("�ܷ���"+scoreTotal+";ƽ�����ǣ�"+scoreAvg);
	}

}
