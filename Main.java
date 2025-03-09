//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Stick member1 = new Stick("Xuan", "Li");
        Stick member2 = new Stick("Meg", "Li");
        Stick member3 = new Stick("Stiff", "Li");

        System.out.println(Stick.getMembers());
//        System.out.println(member2.getFirst());
//        System.out.println(member2.getLast());
//        System.out.println(member2.getMembers());
    }
}