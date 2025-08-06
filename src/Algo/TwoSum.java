package Algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 19;
		Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
            	System.out.println(Arrays.toString(new int[]{i, map.get(diff)}));
            }
            else{
                map.put(nums[i], i);
            }
        }
	}

}
