public class Switch {
    public static void main(String args[]){
        int age;
        age = 0;

        switch (age){
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("It's me.");
                break;
            default:
                System.out.println("Sorry, I don't know.");
                break;
        }
    }
}
