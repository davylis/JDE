/*
 * Create a program called ObjectsCityNames that first inputs city names from the user until the user
decides to quit by entering "quit". Then, the program should print the city names in uppercase in
alphabetical order.

* Use the sort method of the Collections class.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsCityNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> cities = new ArrayList<String>();
		String city = "";
		while(true) {
			System.out.print("Enter city name: ");
			city = input.nextLine();
			if(city.equalsIgnoreCase("quit")) {
				break;
			}
			city = city.toUpperCase();
			cities.add(city);
		}
		System.out.println();
		Collections.sort(cities);
		for(String s: cities) {
			System.out.println(s);
		}
	input.close();
	}
}
