package week1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		//写死数据
		String stuName= "tom";
		int stuAge = 18;
		double stuScore = 80.5;
		System.out.println("学生姓名："+stuName+";学生年龄："+stuAge+";成绩是："+stuScore);
		//控制台输入信息
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		String stuName1 = scan.next();
		System.out.println("请输入学生年龄：");
		int stuAge1 = scan.nextInt();
		System.out.println("请输入学生成绩：");
		double stuScore1 = scan.nextDouble();
		System.out.println("学生姓名："+stuName1+";学生年龄："+stuAge1+";成绩是："+stuScore1);
		double scoreTotal = stuScore + stuScore1;
		double scoreAvg = scoreTotal/2;
		System.out.println("总分是"+scoreTotal+";平均分是："+scoreAvg);
	}

}
