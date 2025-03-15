public class BMICalculator {
    public static void main(String args[]){
        int weight = Integer.parseInt(args[0]);
        int height_1 = Integer.parseInt(args[1]);
        double height = (double) height_1/100;
        double BMI = weight / (height*height);
        System.out.println("Your weight:"+weight+"kg");
        System.out.println("Your height:"+height+"m");
        System.out.println("Your BMI:"+BMI);
        if (BMI<18.5)
            System.out.println("You are in the Underweight.");
        else if(BMI<24.9)
            System.out.println("You are in the Normal.");
        else if(BMI<29.9)
            System.out.println("You are in the Overweight");
        else
            System.out.println("You are in the Obese");
    }
}
