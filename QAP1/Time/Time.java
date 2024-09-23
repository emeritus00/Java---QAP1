public class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Get Hour
    public int getHour() {
        return hour;
    }

    // Get Minute
    public int getMinute() {
        return minute;
    }

    // Get Second
    public int getSecond() {
        return second;
    }

    // Set Hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Set Minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Set Second
    public void setSecond(int second) {
        this.second = second;
    }

    // Set the full time
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // To string
    public String toString() {
        return (hour + ":" + minute + ":" + second);
    }

    // To return next second
    public int nextSecond() {
        return second += 1;
    }

    // To return previous second
    public int previousSecond() {
        return second -= 1;
    }
    
}