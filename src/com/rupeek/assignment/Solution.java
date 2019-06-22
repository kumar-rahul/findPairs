package com.rupeek.assignment;

public class Solution {

	public void findPairs(int N) {
		if (N<10) {
			System.out.println("No Pairs exist.");
		}
		for (int i=10; i<N; i++) {
			int B = N-i;
			
			if(validateB(B, i) && ((countDigit(B) == (countDigit(i)-1) || countDigit(B) == 1))) {
//			if(validateB(B, i) && (countDigit(B) == (countDigit(i)-1))) {	
				System.out.println("Pairs: "+ i + " + " + B + " = " + N);
			}
		}
	}
		
	
	public boolean validateB(int B, int num) {
//		int k;
//	    int tmp = 0;
//	    int i = 0;
//        System.out.println("N:: "+num);
//        System.out.println("B:: "+B);
//        System.out.println("---------------");
	    
		if (countDigit(B) == 1 && B > 0) {
			int k;
			int leadingZeros = countDigit(num)-1;				
			String formatted = String.format("%0"+leadingZeros+"d", B);

			for (int j=0; j<formatted.length(); j++) {
				int temp = Integer.parseInt(formatted.charAt(j)+"");
		        int N = num;
		        
				while(N > 0) {
				  k=N%10;
				  if(k==temp) {
					  break;
				  }
				  N /= 10;

				  if (k != temp && N == 0) {
					  return false;
				  }
				}				
			}
	    } else {

	    	int tmp = 0;
		
	        while(B > 0) {
	    		int k;
	
	        	if (tmp == (B % 10)) {
	        		return false;
	        	}
		        tmp = B % 10;
	//	        System.out.println("right most of B:: "+tmp);
		        int N = num;
				while(N > 0) {
				  k=N%10;
	//		        System.out.println("right most of N:: "+k);
				  if(k==tmp) {
					  break;
				  }
				  N /= 10;
	//			  System.out.println("N:: "+ N);
	
				  if (k != B && N == 0) {
					  return false;
				  }
				}
		        B /= 10;	        
	//	        System.out.println("B:: "+ B);
		    }
	        
	        
	    }
	        
		return true;
	}

	int countDigit (int n) {
		int count = 0; 
        while (n != 0) { 
            n = n / 10; 
            ++count; 
        } 
        return count; 
	}
	
	
}
