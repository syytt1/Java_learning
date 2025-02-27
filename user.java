public class user {
    private String girlname;
    public user(String name){
        girlname=name;
    }
    public void setName(String name){
        girlname = name;
    }
    public String getName(){
        return girlname;
    }
    public void saying(){
        System.out.printf("Your gf was %s\n", getName());
    }
}
