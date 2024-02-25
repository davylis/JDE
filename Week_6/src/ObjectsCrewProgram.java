import java.util.ArrayList;
import java.util.Iterator;

class Sailor {
	private String name;
	private String email;

	public Sailor(String n, String e) {
		this.name = n;
		this.email = e;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class Crew {
	private ArrayList<Sailor> sailorList;

	public Crew() {
		sailorList = new ArrayList<Sailor>();
	}

	public void addCrewMember(Sailor sailor) {
		sailorList.add(sailor);
	}

	public String toString() {
		String stringCrew = "";
		for (Sailor sailor : sailorList) {
			stringCrew += sailor.getName() + " (" + sailor.getEmail() + ")\n";
		}
		return stringCrew;
	}
}

public class ObjectsCrewProgram {

	public static void main(String[] args) {
		Sailor firstSailor = new Sailor("Frank", "frank@mail.com");
		Sailor secondSailor = new Sailor("Susan", "susan@mail.com");
		Sailor thirdSailor = new Sailor("John", "john@sailors.com");
		Sailor fourthSailor = new Sailor("Ann", "ann@sailors.com");
		Crew firstCrew = new Crew();
		Crew secondCrew = new Crew();
		firstCrew.addCrewMember(firstSailor);
		firstCrew.addCrewMember(secondSailor);
		firstCrew.addCrewMember(fourthSailor);
		secondCrew.addCrewMember(thirdSailor);
		secondCrew.addCrewMember(secondSailor);
		System.out.println("=== First crew ===\n" + firstCrew);
		System.out.println("=== Second crew ===\n" + secondCrew);
		secondSailor.setEmail("Susan@sailors.com");
		System.out.println("===Second crew ===\n" + secondCrew);

	}

}
