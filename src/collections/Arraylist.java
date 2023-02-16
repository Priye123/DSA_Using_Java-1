package collections;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		// pr1();
		// pr2();
		// pr3();
		// pr4();
		// pr5();
		// pr6();
		// pr7();
		// pr8();
		// pr9();
		// pr10();
		// pr11();
		pr12();

	}

	private static void pr12() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		HashMap<Character, Integer> hm = new LinkedHashMap<>();
		// hm.put(s.charAt(0), 1);
		//int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (hm.containsKey(ch)) {
				hm.put(ch,hm.get(ch)+1);
			} else {
				hm.put(ch, 1);
			}
		}
		//System.out.println(hm);
		for(Character c:hm.keySet()) {
			System.out.println(c+" "+hm.get(c));
		}
	}

	// 1. Write a Java program to associate the specified value with the specified
	// key in a HashMap.
	private static void pr11() {
		HashMap<String, Integer> hm = new LinkedHashMap<>();
		hm.put("Ram", 123);
		hm.put("Mohan", 23);
		hm.put("Ram", 40);
//		
		for (String s : hm.keySet()) {
			System.out.println(s + " " + hm.get(s));
		}
//		
//		for(Integer s:hm.values()) {
//			System.out.println(s);
//		}

	}

	private static void pr10() {
		Set<String> s = new LinkedHashSet<>();
		List<Integer> s1 = new ArrayList<>();
		s.add("Ram");
		s.add("Ram");
		s.add("Mohan");
		s.add("Mohan");
		System.out.println(s);

		s1.add(1);
		s1.add(2);
		s1.add(1);
		s1.add(2);
		System.out.println(s1);

	}

	// 9. Write a Java program to copy one array list into another.
	private static void pr9() {
		List<String> a = new ArrayList<>();
		a.add("Green");
		a.add("Yellow");
		a.add("Blue");
		a.add("Brown");
//		
//		List<String> b = new ArrayList<>();
//		b.add("White");
//		b.add("Purple");
//		b.add("Pink");
//		b.add("Brown");

//		String t=a.contains("Blue")?"Yes":"No";
//		System.out.println(t);

		a.clear();
		System.out.println(a);
	}

	// 8. Write a Java program to sort a given array list.
	private static void pr8() {
		List<String> a = new ArrayList<>();
		a.add("Green");
		a.add("Yellow");
		a.add("Blue");
		a.add("Brown");

		// Collections.sort(a,Collections.reverseOrder());
		Collections.reverse(a);
		System.out.println(a);
	}

	// 7. Write a Java program to search an element in a array list.
	private static void pr7() {
		List<String> a = new ArrayList<>();
		a.add("Green");
		a.add("Yellow");
		a.add("Blue");
		a.add("Brown");

	}

	// 6. Write a Java program to remove the third element from a array list.
	private static void pr6() {
		List<String> a = new ArrayList<>();
		a.add("Green");
		a.add("Yellow");
		a.add("Blue");
		a.add("Brown");
		a.remove(2);
		System.out.println(a);

	}

	// 5. Write a Java program to update specific array element by given element.
	private static void pr5() {
		List<String> a = new ArrayList<>();
		a.add("Green");
		a.add("Yellow");
		a.add("Blue");
		a.add("Brown");
		a.set(2, "White");
		System.out.println(a);

	}

	// 4. Write a Java program to retrieve an element (at a specified index) from a
	// given array list.
	private static void pr4() {
		List<String> a = new ArrayList<>();
		a.add("Green");
		a.add("Yellow");
		a.add("Blue");
		a.add("Brown");

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == "Blue") {
				System.out.println(i);
				break;
			}
		}
	}

	// 3. Write a Java program to insert an element into the array list at the first
	// position.
	private static void pr3() {
		List<String> a = new ArrayList<>();
		a.add("Green");
		a.add("Yellow");
		a.add("Blue");
		a.add("Brown");
		a.add(0, "Black");
		System.out.println(a);

	}

	// 2. Write a Java program to iterate through all elements in a array list.
	private static void pr2() {
		ArrayList<String> a = new ArrayList<>();
		a.add("Green");
		a.add("Yellow");
		a.add("Blue");
		a.add("Brown");

//		for(String s:a) {
//			System.out.println(s);
//		}

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

	// 1. Write a Java program to create a new array list, add some colors (string)
	// and print out the collection.
	private static void pr1() {
		ArrayList<String> a = new ArrayList<>();
		a.add("Green");
		a.add("Yellow");
		a.add("Blue");
		a.add("Brown");

		System.out.println(a);
	}

}
