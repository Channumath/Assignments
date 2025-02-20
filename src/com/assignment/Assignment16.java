/* Program to print "*" in Triangle pattern when int rows=5*/

package com.assignment;
public class Assignment16 {
	public static void main(String[] args) {
	int rows=5;
	System.out.println("Your Patter Matching: " +rows);	
		for(int a=1;a<=rows;a++) {	
			for(int b=1;b<=rows-a;b++) {
				System.out.print(" ");
			}
				for(int c=1;c<=a;c++) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
}

