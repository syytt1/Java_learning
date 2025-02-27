import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        tuna tunaObject = new tuna();

        System.out.println("Enter your name here:");
        String name = input.nextLine();
        tunaObject.simpleMessage(name);
    }
}