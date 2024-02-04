/*
 * Create a program called MethodsCalendar that has a method called printCalendar. The method
should take month number and year as parameters and print a one-month calendar in Finnish. See
the example output below for more details.
The main method should first input year and month number from the user and then call the
printCalendar method.
 */
import java.time.LocalDate;
import java.util.Scanner;

public class MethodsCalendar {
	//declares a method named "printCalendar" that takes two parameters
	public static void printCalendar(int month, int year) {
		//Initialize an array
		String[] months = { "Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu", "Kesäkuu", "Heinäkuu",
				"Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu" };
		//assign the month name corresponding to given month number
		String monthString = months[month - 1];

		System.out.println(" > " + monthString + " " + year + " <");
		System.out.println(" Ma Ti Ke To Pe La Su");
		//Use LocalDate to get first day of the specified month and calculate the total
		//days in the month and the day of the week for the first day
		//create a LocalDate object named myDate
		LocalDate myDate = LocalDate.of(year, month, 1);
		int daysInMonth = myDate.lengthOfMonth();
		int daysOfWeek = myDate.getDayOfWeek().getValue();
		//Prints empty spaces corresponding to the day of the week for the first day
		int dayCounter = 1;

		for (int i = 1; i < daysOfWeek; i++) {
			System.out.print("   ");
		}
		//Print days of the month with proper formatting
		//Checks for the end of the week or end of the month to move to the next line
		for (int day = 1; day <= daysInMonth; day++) {
			System.out.printf("%3d", day);
			//
			if ((day + daysOfWeek - 1) % 7 == 0 || day == daysInMonth) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = Integer.parseInt(input.nextLine());

		System.out.print("Enter month: ");
		int month = Integer.parseInt(input.nextLine());
		System.out.println();

		printCalendar(month, year);

		input.close();
	}

}
