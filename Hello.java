package first_class;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("你好");
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:" + in.nextLine());
		int price = 0;
		// final定义常量
		int amount = 100;
		System.out.println(price);
		System.out.print("请输入票面：");
		amount = in.nextInt();
		System.out.print("请输入金额：");
		price = in.nextInt();
		System.out.println(amount + "-" + price + "=" + (amount-price));
	}
}
