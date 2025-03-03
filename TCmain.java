public class TCmain {
    public static void main(String[] args){

        Time_Class TCObject = new Time_Class();
        Time_Class TCObject1 = new Time_Class(5);
        Time_Class TCObject2 = new Time_Class(4,1);
        Time_Class TCObject3 = new Time_Class(1,2,3);

        System.out.printf("%s\n",TCObject.toMilitary());
        System.out.printf("%s\n",TCObject1.toMilitary());
        System.out.printf("%s\n",TCObject2.toMilitary());
        System.out.printf("%s\n",TCObject3.toMilitary());
    }
}
