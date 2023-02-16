package collections;

import java.util.HashMap;
import java.util.Map;

public class MapBasics {

	public static void main(String[] args) {
		Map<String, Object> employee = new HashMap<>();
		employee.put("id", 1);
		employee.put("first_name", "Raman");
		employee.put("last_name", "Sharma");
		employee.put("married", false);
		employee.put("salary", 23.5);

		System.out.println(employee);
	}

}
