/* Program to print "*" in Triangle pattern when int rows=5*/

package com.assignment;
public class Assignment16 {
	public static void main(String[] args) {
	int rows=5;
	System.out.println("Patter Matching:" +rows);	
		for(int i=1;i<=rows;i++) {	
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
}

