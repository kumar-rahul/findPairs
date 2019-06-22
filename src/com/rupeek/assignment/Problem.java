package com.rupeek.assignment;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Solution sol = new Solution();

		System.out.print("Enter number: ");
        int number = input.nextInt();
        
		sol.findPairs(number);
	}

}
