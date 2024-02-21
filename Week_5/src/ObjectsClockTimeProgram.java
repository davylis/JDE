/*
 * This time, we want to represent robust clock times. In the real world, a valid clock time is between
00:00 and 23:59
Create a new class called ClockTime that represents clock time.

The additional business rules are the following:
• Initially, the clock time is always 00:00
• The add method rolls the time forward by the given number of hours and minutes. If either
parameter value is negative, then the time should not change.
• The toString method returns the textual representation of the clock time in the "hh:mm" format
Hint: You can use if statements to determine if you need to add a leading zeros
 */

import java.util.Scanner;

class ClockTime {
	private int hours;
	private int minutes;

	ClockTime() {
	}

	public void add(int hours, int minutes) {
		if (hours < 0 || minutes < 0)
			return;
		this.minutes += minutes;
		if(this.minutes > 59) {
			hours += this.minutes/60 ;
			this.minutes %= 60;
		}
		this.hours += hours;
		if(this.hours > 23) {
			this.hours %= 24;
		}
		
	}

	public String toString() {
		return String.format("%02d:%02d", this.hours, this.minutes);
	}
}

public class ObjectsClockTimeProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClockTime clockTime = new ClockTime();
		System.out.print("Enter hours to add: ");
		int hours = Integer.parseInt(input.nextLine());
		while (hours >= 0) {
			System.out.print("Enter minutes to add: ");
			int minutes = Integer.parseInt(input.nextLine());
			clockTime.add(hours, minutes);
			System.out.println(clockTime + "\n");
			System.out.print("Enter hours to add: ");
			hours = Integer.parseInt(input.nextLine());
		}
		input.close();
	}
}