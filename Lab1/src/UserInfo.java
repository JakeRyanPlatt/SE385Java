import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the user's full name
        System.out.println("Please Enter your First and Last Name");
        String fullName = scanner.nextLine();

        // Split the name into first and last
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Get the user's date of birth
        System.out.println("Please Enter your Date of Birth");
        String dob = scanner.nextLine();

        // Split the date into month, day, and year
        String[] dateParts = dob.split("[/\\-]"); //regex for "-" and "/"
        String month = dateParts[0];
        String day = dateParts[1];
        String year = dateParts[2];

        // Convert the month number to its abbreviation
        String monthName = switch (month) {
        case "01" -> "January";
        case "02" -> "February";
        case "03" -> "March";
        case "04" -> "April";
        case "05" -> "May";
        case "06" -> "June";
        case "07" -> "July";
        case "08" -> "August";
        case "09" -> "September";
        case "10" -> "October";
        case "11" -> "November";
        default   -> "December";
    };
        // BONUS: Strip the leading zero from the day
        if (day.startsWith("0")) {
            day = day.substring(1);
        }

        // Print the final result
        System.out.println(lastName + ", " + firstName + " had a Date of Birth of "
                + monthName + " " + day + ", " + year);

        scanner.close();
    }
}