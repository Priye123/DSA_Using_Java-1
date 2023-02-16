package recursion2;

public class FamilyStructure {

	public static String kthChildNthGeneration(int n, long k) {
		// Write your code here
		if (n == 1)
			return "Male";

		// If Parent is "Female"
		if (kthChildNthGeneration(n - 1, (k + 1) / 2).equals("Female")) {

			if (k % 2 != 0)
				return "Female";
			else
				return "Male";
		}
		// if Parent is "Male"
		if (k % 2 != 0)
			return "Male";
		else
			return "Female";

	}

	public static void main(String[] args) {
		System.out.println(kthChildNthGeneration(3, 4));
	}

}
