
/*
 * Create a program called ArraysLotto that generates 7 unique lotto 
 * numbers (no duplicate numbers allowed) and shows them in ascending order.
 *  Each lotto number is a random integer between 1 and 39.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArraysLotto {

	public static boolean IsInList(List<Integer> list, int number) {
		// for(int i : list)
		for (int j = 0; j < list.size(); j++) {
			int i = list.get(j);
//			int i = lis[j];
			// continues
			if (i == number) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Random randomGenerator = new Random();
		List<Integer> lottoNumbers = new ArrayList<>(7);
		// generate integers between 1 and 39
		// +1 because 1 is 0 and 2 is 1
		int number;
		for (int i = 0; i < 7; i++) {
			do {
				number = randomGenerator.nextInt(39) + 1;
			} while (IsInList(lottoNumbers, number));

			lottoNumbers.add(number);
		}
		Collections.sort(lottoNumbers);
		System.out.println(lottoNumbers);
	}

}
