package week1;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName = scan.next();
		System.out.println("请输入用户密码：");
		String password = scan.next();
		// 生成四位验证码
			int code1 = (int) (Math.random() * 10);
			int code2 = (int) (Math.random() * 10);
			int code3 = (int) (Math.random() * 10);
			int code4 = (int) (Math.random() * 10);
			String code = "" + code1 + code2 + code3 + code4;
			System.out.println("验证码：【" + code + "】");
		if (userName.equals("admin") && password.equals("1234")) {
			System.out.println("请输入验证码：");
			String myCode = scan.next();
			if (myCode.equals(code)) {
				System.out.println("登陆成功！！！");
				System.out.println("请输入你的年龄：");
				int userAge = scan.nextInt();
				if (userAge >= 18) {
					System.out.println("成年人可以玩8小时");
				} else {
					System.out.println("未成年人只能玩2小时");
				}
			}else {
				System.out.println("验证码错误！！！");
			}

		} else {
			System.out.println("用户名或密码错误!!!");
		}
	}
}
