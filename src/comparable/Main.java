package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//POJO class
class Student implements Comparable<Student> {

	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		return o.marks - this.marks;
	}
}

class Sort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.marks - o1.marks;
	}

}

class Main {

	public static void main(String[] args) {
		List<Student> l = new ArrayList<>();

		l.add(new Student("Raman", 90));
		l.add(new Student("Naman", 25));
		l.add(new Student("Aman", 80));
		l.add(new Student("Chaman", 106));
		l.add(new Student("Taman", 90));

		// System.out.println(l.get(0).getMarks());
		// Collections.sort(l);

		//Collections.sort(l, new Sort());
		//we need object only so we can make it a anonymous class for Comparator interface.
		
		Collections.sort(l, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.marks - o1.marks;
			}
		});
		System.out.println(l);

	}
}
