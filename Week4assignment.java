package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4assignment {

	public static void main(String[] args) {
		
		
		List<String> employeeNames = new ArrayList<String>();			    // Step 1
		
		Set<Integer>ids = new HashSet<Integer>(); 							// Step 2
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();  // Step 3
		
		employeeNames.add("Cloud");    										// Step 4
		employeeNames.add("Barret");
		employeeNames.add("Tifa");
		employeeNames.add("Aerith");
		employeeNames.add("Sephiroth");
		for (int i = 1; i <= employeeNames.size(); i++) {
			ids.add(i);
		}
		
		
		int i = 0;															// Step 5
		for (Integer id : ids) {
			employeeMap.put(id,  employeeNames.get(i));
			i++;
		}
		
		
		
		for (Integer key : employeeMap.keySet()) {							// Step 6
			System.out.println(employeeMap);
		}
		
		
		StringBuilder idsBuilder = new StringBuilder();						// Step 7
		
		
		for (Integer id : ids) {											// Step 8
			idsBuilder.append(id + "-");
		}
		if (idsBuilder.charAt(idsBuilder.length() - 1) == '-') {
			idsBuilder.setLength(idsBuilder.length() - 1);
		}
		
		
		System.out.println(idsBuilder.toString());							// Step 9
		
		
		StringBuilder namesBuilder = new StringBuilder();					// Step 10
		
		for (String name : employeeNames) {									// Step 11
			namesBuilder.append(name + " ");
		}
		
		System.out.println(namesBuilder.toString());
		
		
		
		//System.out.println(employeeNames);
		//System.out.println(ids);
		//System.out.println(employeeMap);

	}

}
