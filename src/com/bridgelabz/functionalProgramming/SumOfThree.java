package com.bridgelabz.functionalProgramming;

import java.util.Scanner;

public class SumOfThree {
	
	public static void main(String args[]) {

		int number = 0;
		
		Scanner s = new Scanner(System.in);
		
		number = s.nextInt();
		
		int count = 0;
		
		int array[] = new int [number];
		
		for (int i=0;i<number;i++) {
			array[i] = s.nextInt();
		}
		
		for (int i=0;i<number;i++) {
			for (int j=i+1;j<number;j++) {
				for (int k=j+1;k<number;k++) {
					int sum = array[i] + array[j] + array[k];
					
					if(sum == 0) {
						count ++;
						System.out.println(array[i] + "," + array[j] + "," + array[k]);
					}
					
				}
			}
		}
		
		System.out.println("Total occurence of triplets is " + count);
		
	}

}
