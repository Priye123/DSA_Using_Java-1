package recursion_sameer;

public class Student {

	int rollno;
	int marks;
	String name;

	public Student(int rollno, int marks, String name) {
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	public static void main(String[] args) {
		Student s[] = new Student[5];
		char ch = 'r';

		for (int i = 0; i < 5; i++) {
			s[i] = new Student(10 + i, 6 + i * 2, ch + "aman");
			ch = (char) (ch + 1);
		}
		

		for (Student d : s) {
			System.out.println(d.rollno + " " + d.marks + " " + d.name);
		}
	}

}
