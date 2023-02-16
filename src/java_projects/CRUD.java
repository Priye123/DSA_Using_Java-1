package java_projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//POJO class
class Employee {

	private String name;
	private int empno;
	private double salary;
	private char gender;

	public Employee(String name, int empno, double salary, char gender) {
		this.name = name;
		this.empno = empno;
		this.salary = salary;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", empno=" + empno + ", salary=" + salary + ", gender=" + gender + "]";
//	}

}

public class CRUD {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		// Scanner integer = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.print("Enter Your choice::");
			choice = Integer.parseInt(sc.next());

			switch (choice) {
			case 1:
				System.out.print("Enter employee name::");
				String name = sc.next();
				System.out.print("Enter employee number::");
				int empno = sc.nextInt();
				System.out.print("Enter employee salary::");
				double salary = sc.nextDouble();
				System.out.print("Enter employee gender::");
				char gender = sc.next().charAt(0);

				l.add(new Employee(name, empno, salary, gender));
				break;

			case 2:
				System.out.println("--------------------------------------------------------");
				for (Employee e : l) {
					System.out.println(e.getName() + " " + e.getEmpno() + " " + e.getSalary() + " " + e.getGender());
				}
				System.out.println("--------------------------------------------------------");
				break;

			case 3:
				System.out.print("Enter empno to search employee details::");
				int eno = sc.nextInt();
				System.out.println("--------------------------------------------------------");
				for (Employee e : l) {
					if (e.getEmpno() == eno) {
						System.out
								.println(e.getName() + " " + e.getEmpno() + " " + e.getSalary() + " " + e.getGender());
					}
				}
				System.out.println("--------------------------------------------------------");
				break;

			case 4:
				System.out.print("Enter employee name to delete::");
				String ename = sc.next();
				int counter = 0;
				// System.out.println("--------------------------------------------------------");
				for (Employee e : l) {
					if (e.getName().equals(ename)) {
						break;
					}
					counter++;
				}
				l.remove(counter);
				// System.out.println("--------------------------------------------------------");
				break;

			case 5:
				System.out.print("Enter empno to update his/her details::");
				int enumb = Integer.parseInt(sc.next());
				System.out.print("Enter new name for employee::");
				String name1 = sc.next();
				System.out.print("Enter updated salary::");
				double sal = sc.nextDouble();

				for (Employee e : l) {
					if (e.getEmpno() == enumb) {
						e.setName(name1);
						e.setSalary(sal);
					}
				}
				break;
			}

		} while (choice != 0);
	}

}
