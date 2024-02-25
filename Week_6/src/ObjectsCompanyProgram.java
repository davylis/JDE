/*
 * Create classes Department and Employee.

The Department class has two fields (number, name), a parametric constructor, and getters/setters
for the both fields.
The Employee class has three fields (name, email, department), a parametric constructor,
getters/setters for all the fields, and the toString method.
 */

class Department {
	private int number;
	private String name;

	Department(int n, String nn) {
		this.number = n;
		this.name = nn;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Employee {
	private String name;
	private String email;
	private Department department;

	Employee(String n, String e, Department d) {
		this.name = n;
		this.email = e;
		this.department = d;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		return this.name + " (" + this.email + "), " + department.getName() + " department";
	}
}

public class ObjectsCompanyProgram {
	public static void main(String[] args) {
		Department firstDepartment = new Department(10, "Sales");
		Department secondDepartment = new Department(20, "Music");
		Employee[] employeeArray = { new Employee("John Doe", "john@abc.com", firstDepartment),
				new Employee("Hank Marvin", "hank@abc.com", secondDepartment),
				new Employee("Joan Baez", "joan@abc.com", secondDepartment) };
		for (Employee employee : employeeArray) {
			System.out.println(employee);
		}
		System.out.println();
		employeeArray[0].setDepartment(secondDepartment);
		for (Employee employee : employeeArray) {
			System.out.println(employee);
		}
	}
}