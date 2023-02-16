public class Person {

	private String name;
	private int empid;
	private char gender;

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public Person setName(String name) {
		this.name = name;
		return this;
	}

//	
//	public int getEmpid() {
//		return empid;
//	}
//
//
//
//	public void setEmpid(int empid) {
//		this.empid = empid;
//	}
//
//
//
//	public char getGender() {
//		return gender;
//	}
//
//
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p);
		// char a=p.getGender();
//		Person c = p.setName("Ram");
//		System.out.println(c.getName());
//		
//		Person p1=new Person();
//		Person p2=new Person();
//		
//		p1.setName("Mohan");
//		p2.setName("Raman");
//		Collections.sort(a);
//		Arrays.sort(null);

		System.out.println(p.setName("Ram"));

	}

}
