public class TestTime {
    public static void main(String[] args) {
        // Object of the class
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);
        
        // Calling nextSecond() and previousSecond()
        t1.nextSecond();
        t2.previousSecond();

        //Storing in variables
        String time1 = t1.toString();
        String time2 = t2.toString();

        //Displaying t1 and t2
        System.out.println("\nNext Second: " + time1);
        System.out.println("Previous Second: " + time2 + "\n");
    }
}
