package Algo;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num : nums){
            s.add(num);
        }
        int count=0;
        int maxCount = 0;
        int temp=0;
        for(int numInSet : s){
            if(!(s.contains(numInSet-1))){
                count=1;
                temp = numInSet;
            }

            while(s.contains(temp+1)){
                count++;
                temp++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
	
	public static void main(String[] args) {
		LongestConsecutiveSequence lp = new LongestConsecutiveSequence();
		System.out.println(lp.longestConsecutive(new int [] {100,4,200,1,2,3}));

	}

}
