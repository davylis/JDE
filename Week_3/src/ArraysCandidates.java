/*
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

class Candidate {
	Candidate() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	private String name;
	private int votes;
}

public class ArraysCandidates {

	public static ArrayList<Candidate> getWinners(ArrayList<Candidate> candidates) {
		ArrayList<Candidate> winners = new ArrayList<Candidate>();
		int biggestVote = 0;
		for (Candidate i : candidates) {
			if (i.getVotes() >= biggestVote) {
				biggestVote = i.getVotes();
			}
		}
		for (Candidate i : candidates) {
			if (i.getVotes() == biggestVote) {
				winners.add(i);
			}
		}
		return winners;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of candidates: ");
		int candidates_num = Integer.parseInt(input.nextLine());
		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
		for (int i = 0; i < candidates_num; i++) {
			Candidate candidate = new Candidate();
			System.out.print("Enter name: ");
			candidate.setName(input.nextLine());
			System.out.print("Enter " + candidate.getName() + "'s votes: ");
			candidate.setVotes(Integer.parseInt(input.nextLine()));
			candidates.add(candidate);
		}

		ArrayList<Candidate> winners = getWinners(candidates);
		if (winners.size() < 2) {
			Candidate winner = winners.get(0);
			System.out.println();
			System.out.println(winner.getName() + " is the winner with " + winner.getVotes() + " votes!");
		} else {
			System.out.println("It's a tie!");
			for (Candidate i : winners) {
				System.out.println(i.getName() + " (" + i.getVotes() + " votes)");
			}
		}
		input.close();
	}
}
