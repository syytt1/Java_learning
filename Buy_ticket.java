package second_class;

import java.util.Scanner;

public class Buy_ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize
		Scanner in = new Scanner(System.in);
		System.out.print("请投币：");
		int amount = in.nextInt();
		System.out.println(amount);
		System.out.println(amount>=10);
		
		if (amount >=10) {
			// 打印车票
			System.out.println("******************");
			System.out.println("*Java Subway line*");
			System.out.println("**   Price:10   **");
			System.out.println("******************");
			// 打印计算并找零
			System.out.println("Change:"+(amount-10));
		}
	}

}
