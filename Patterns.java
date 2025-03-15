public class Patterns {
    public void printPattern1(int num) {
// Write your code here (taken from your solution of Question 1).
//        int num = Integer.parseInt((n);
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void printPattern2(int num) {
// Write your code here (taken from your solution of Question 2).
        for (int i=num;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) { // Write your code here.
        int num = Integer.parseInt(args[0]);
        Patterns patterns = new Patterns();
        patterns.printPattern1(num);
        patterns.printPattern2(num);
    }
}
