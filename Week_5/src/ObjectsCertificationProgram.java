/*
 * First, create a new class called Coach. 
 * 
 * Then, create a main program called ObjectsCertificationProgram. In the program,
1. Create an array of four Coaches.
2. Input names and scores of four coaches from the user. Create a Coach object for each coach
and assign its reference to the array.
3. Input the minimum passing score.
4. List all those coaches (name, score) who have passed the test.
5. Finally, show the certification test passing rate.
 */

import java.util.Scanner;

class Coach {
	private String name;
	private int score;

	Coach(String n, int p) {
		this.name = n;
		this.score = p;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}
}

public class ObjectsCertificationProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Coach[] coaches = new Coach[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("Enter coach name:");
			String name = input.nextLine();
			System.out.print("Enter " + name + "'s score: ");
			int score = Integer.parseInt(input.nextLine());
			coaches[i] = new Coach(name, score);
		}
		System.out.println();
		System.out.print("Enter the minimum passing score: ");
		int minScore = Integer.parseInt(input.nextLine());

		System.out.println();
		System.out.println("Passing scores");
		int count = 0;
		for (Coach c : coaches) {
			if (c.getScore() >= minScore) {
				System.out.println(c.getName() + " (" + c.getScore() + " points)");
				count++;
			}
		}
		double passingRate = (double)count / 4 * 100;
		System.out.println("The passing rate is " + passingRate + "%");
	}
}
