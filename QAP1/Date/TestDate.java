public class TestDate {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date(8, 9, 2024);

        // Display the date using toString
        System.out.println("\nInitial Date: " + date);

        // Set a new date
        date.setDate(15, 10, 2023);

        // Display the updated date
        System.out.println("Updated Date: " + date + "\n");
    }
}
