public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Get Day
    public int getDay() {
        return this.day;
    }

    // Get Month
    public int getMonth() {
        return this.month;
    }

    // Get Year
    public int getYear() {
        return this.year;
    }

    // Set Day
    public void setDay(int day) {
        this.day = day;
    }

    // Set Month
    public void setMonth(int month) {
        this.month = month;
    }

    // Set Year
    public void setYear(int year) {
        this.year = year;
    }

    // Set the full date
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // To string
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}