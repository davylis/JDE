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

	public static void printCalendar(int month, int year) {
		String[] months = { "Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu", "Kesäkuu", "Heinäkuu",
				"Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu" };

		String monthString = months[month - 1];

		System.out.println(" > " + monthString + " " + year + " <");
		System.out.println(" Ma Ti Ke To Pe La Su");

		LocalDate myDate = LocalDate.of(year, month, 1);
		int daysInMonth = myDate.lengthOfMonth();
		int daysOfWeek = myDate.getDayOfWeek().getValue();
System.out.println(daysOfWeek);
	//	int dayCounter = 1;

		for (int i = 1; i < daysOfWeek; i++) {
			System.out.print("   ");
		}
		for (int day = 1; day <= daysInMonth; day++) {
			System.out.printf("%3d", day);

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
