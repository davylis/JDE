/*
 * Create a program called ArraysCities. The program should first input the number of cities to be
saved to an array. Then the program should create the array, input cities, and save them to the
array. Finally, the program should find all distinct city names in the array and print them in
alphabetical order. See the example output for more details.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysCities {

//	public static String[] AlphabeticalOrder(String cities[]){
		
//		String temp;
//		for (int i = 0; i < cities.length; i++) {
//			for (int j = 0; j < cities.length; j++) {
//				if(cities[i].compareTo(cities[j]) > 0){
//					temp = cities[i];
//					cities[i]=cities[j];
//					cities[j]=temp;
//				}
//			}
//		}
//		return cities;
//	}
	
	public static ArrayList<String> DistinctCities(String cities[]) {
		
		ArrayList<String> distinctCities = new ArrayList<String>();
		for(int i = 0; i < cities.length; i++) {
			if(isInArray(cities[i], distinctCities) == false) {
				distinctCities.add(cities[i]);
			}
		}
		return distinctCities;
	}
	
	public static boolean isInArray(String string, List<String> array ) {
		
		boolean  state = false;
//		for (int i = 0; i < array.size(); i++) {
//			String array_i = array.get(i);
//			if(string.equals(array_i))
//				state = true;
//		}
		for(String array_i : array) {
			if(string.equals(array_i))
				state = true;
		}
		return state;
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of city names: ");
        int number = Integer.parseInt(input.nextLine());

        String[] cities = new String[number];

        int i = 0;
        while (i < number) {
            System.out.print("Enter city name: ");
            String city = input.nextLine();
            cities[i] = city;
            i++;
        }
        System.out.println();

        ArrayList<String>distinctCities = DistinctCities(cities);
        Collections.sort(distinctCities);
      
        System.out.print("Distinct city names: ");
        for (String city : distinctCities) {
            System.out.print(city + " ");
        }
    }
}