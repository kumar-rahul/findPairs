package com.rupeek.assignment;

public class Solution {

	public void findPairs(int N) {
		if (N<10) {
			System.out.println("No Pairs exist.");
		}
		for (int i=10; i<=N; i++) {
			int B = N-i;
//			if (B<10) {
//				B = String.valueOf(B);
//			}
			if(validateB(B, i) && (countDigit(B) == (countDigit(i)-1) || countDigit(B) == 1)) {
				System.out.println("Pairs: "+ i + " + " + B + " = " + N);
			}
		}
	}
	
	
//			906 + 96 = 1002
//			911 + 91 = 1002
//			951 + 51 = 1002

//			991 + 11 = 1002	
//			903 + 99 = 1002
//			936 + 66 = 1002
//			963 + 39 = 1002
	
	
	public boolean validateB(int B, int num) {
		int k;
	    int tmp = 0;
	    int i = 0;
//        System.out.println("N:: "+num);
//        System.out.println("B:: "+B);
//        System.out.println("---------------");
        
        while(B > 0) {
	        tmp = B % 10;
//	        System.out.println("right most of B:: "+tmp);
	        int N = num;
			while(N > 0) {
			  k=N%10;
//		        System.out.println("right most of N:: "+k);
			  if(k==tmp) {
//				  i++;
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
	void addSquaresOfDigits(int number) {
	    int tmp = 0;
	    while(number > 0) {
	        tmp = number % 10;
	        System.out.println(tmp);
	        number /= 10;
	    }
	}	
	
	
}
