public class mid {
    private String name;
    private birth birthday;

    public mid(String theName, birth theData){
        name = theName;
        birthday = theData;
    }

    public String toString(){
        return String.format("My name is %s, My birthday is %s", name, birthday);
    }
}
