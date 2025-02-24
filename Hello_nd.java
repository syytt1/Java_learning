package first_class;

import java.util.Scanner;

public class Hello_nd {
	 
	public static void main(String[] args) {
		int foot;
		double inch;
		foot = (int)(30/3.0);
		// 浮点数有误差
		System.out.println(1.2-1.1);
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextDouble();
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
	}
	
}
