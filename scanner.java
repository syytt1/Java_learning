import java.util.Scanner;

public class scanner {
    public static void main(String args[]){
        Scanner xuan = new Scanner(System.in);
//        System.out.println(xuan.nextLine());
        double fnum,snum,answer;
        System.out.println("Enter first num");
        fnum = xuan.nextDouble();
        System.out.println("Enter second num");
        snum = xuan.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}
