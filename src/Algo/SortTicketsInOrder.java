package Algo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SortTicketsInOrder {

	public static void main(String[] args) {

		Map<String, String> tickets = new HashMap<>();
		tickets.put("chennai", "bengalure");
		tickets.put("Delhi", "Kolkata");
		tickets.put("bengalure", "Delhi");
		
		Set<String> destinations = new HashSet<>(tickets.values());
		String start = null;
		for (String src : tickets.keySet()) {
		    if (!destinations.contains(src)) {
		        start = src; 								// This is our starting point: "chennai"
		        break;
		    }
		}
		
		while (tickets.containsKey(start)) {
		    String next = tickets.get(start);
		    System.out.println(start + " -> " + next);
		    start = next;
		}

	}

}
