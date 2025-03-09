public class Stick {
    private String first;
    private String last;
    private static int members = 0;
    // Important! static shared in each object!
    public Stick(String fn, String ln){
        first = fn;
        last = ln;
        members++;
        System.out.format("Constructor for %s %s, members in the club: %d\n", first, last, members);
    }

    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public static int getMembers(){
        return members;
    }
}
