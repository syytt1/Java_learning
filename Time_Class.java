public class Time_Class {
    private int hour;
    private int min;
    private int second;

    public Time_Class(){
        this(0,0,0);
    }

    public Time_Class(int h){
        this(h,0,0);
    }

    public Time_Class(int h, int m){
        this(h,m,0);
    }

    public Time_Class(int h, int m,int s){
        setTime(h,m,s);
    }

    public void setTime(int h,int m,int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h){
        hour = ((h>=0 && h<24 ? h:0));
    }

    public void setMinute(int m){
        min = ((m>=0 && m<60 ? m:0));
    }

    public void setSecond(int s){
        second = ((s>=0 && s<60 ? s:0));
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return min;
    }

    public int getSecond(){
        return second;
    }

    public  String toMilitary(){
        return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
    }
}
