package Algo;

import java.util.Arrays;
import java.util.List;

public class BinaryEncrytDecrypt {
	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(7, 3, 1, 6, 1);
	    List<Integer> binary = Arrays.asList(1, 0, 0, 0, 1); // 1 = encrypted, 0 = decrypted
	    int k = 2;

	    int encrpytMax = 0;
	    int n = list.size();
	    
	    for (int i = 0; i < n; i++) {
	        if (binary.get(i) == 1) {
	        	encrpytMax += list.get(i);
	        }
	    }
	    int windowSum = 0;
	    int decryptMax = 0;

	    // Pre-calculate the first window
	    for (int i = 0; i < k; i++) {
	        if (binary.get(i) == 0) {
	            windowSum += list.get(i);
	        }
	    }
	    decryptMax = windowSum;

	    // Slide the window from left to right
	    for (int i = k; i < n; i++) {
	        if (binary.get(i - k) == 0) {
	            windowSum -= list.get(i - k);
	        }
	        if (binary.get(i) == 0) {
	            windowSum += list.get(i);
	        }
	        decryptMax = Math.max(decryptMax, windowSum);
	    }

//	    int decryptMax = 0;
//
//	    for (int i = 0; i <= n - k; i++) { //23
//	        int windowSum = 0;
//	        for (int j = i; j < i + k; j++) { //0<2, 1<3
//	            if (binary.get(j) == 0) {
//	                windowSum += list.get(j);
//	            }
//	        }
//	        decryptMax = Math.max(decryptMax, windowSum);
//	    }

	    int maxTotalEncrypted = encrpytMax + decryptMax;
	    System.out.println("Max encrypted sum after converting a window of size " + k + ": " + maxTotalEncrypted);
	}

}
