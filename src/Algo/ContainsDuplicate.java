package Algo;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int [] nums = {1,2,3,1};
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : nums) {
			
			if(map.containsKey(num)) {
				System.out.println(true);
			}
			else {
				map.put(num, 1);
			}
		}
		System.out.println(false);

	}

}
