package linked_list_new;

class Teacher {
	int id;
	Teacher name;
}

public class Student {

	Teacher n1;
	Teacher n2;
	int size;

//	public Student(Teacher n1, Teacher n2, int i) {
//		n1.id = i;
//	}

	public static void main(String[] args) {
		//Student s = new Student(null, null, 0);
		Student s = new Student();
		Teacher t = new Teacher();
		s.add(20);
	}

	private void add(int i) {
		Teacher t = new Teacher();
		t.id = i;
		// t.name=null;

		Teacher t1 = new Teacher();
		t1.id = i + 1;
		t.name = t1;
		t1.name = null;

		System.out.println(t.id + " " + t1.id+" "+n1.id);

	}

}
