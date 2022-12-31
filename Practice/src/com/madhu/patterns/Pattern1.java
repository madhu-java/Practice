package com.madhu.patterns;

import java.awt.print.Printable;

public class Pattern1 {

	public static void main(String[] args) {
		//H
		int n=10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(3*n)/4||i==(n-1)/2 && j<=(3*n)/4) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			
			System.out.print(" ");
		}
		//A
		
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1)||i==0 ||i==(n-1)/2) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				
			}
			
			
		}
			System.out.print(" ");
			//p
			for(int j=0;j<n;j++) {
				if(j==0&&i!=0 || i==0 || j==n-1 && i<=(n-1)/2|| i==(n-1)/2) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				
			}
			
			
		}
			System.out.print(" ");
			//p
			for(int j=0;j<n;j++) {
				if(j==0&&i!=0 || i==0 || j==n-1 && i<=(n-1)/2|| i==(n-1)/2) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				
			}
			
			
		}
			System.out.print(" ");
			//y
			for(int j=0;j<n;j++) {
				if(i+j==n-1 && i<=n-1/2|| i==j &&j<=(n-1)/2) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				
			}
			
			
		}
			System.out.print(" ");
			
			
			System.out.println( );
		}
		System.out.println();
		//new
		for(int i=0;i<=n ;i++) {
			//N
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				
			}
			
			
		}
			System.out.print(" ");
			
			//E
			for(int j=0;j<n;j++) {
				if(i==0 || i==n||i==(n-1)/2||j==0) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				
			}
			
			
		}
			System.out.print(" ");
			//w
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j&& i>=(n-1)/2|| i+j==n-1 && i>(n-1)/2) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				
			}
			
			
		}
			System.out.print(" ");
			System.out.println();
			
		}
	System.out.println();
//year
	
			for(int i=0;i<=n ;i++) {
				//Y
				//y
				for(int j=0;j<n;j++) {
					if(i+j==n-1 && i<=n-1/2|| i==j &&j<=(n-1)/2) {
						System.out.print("*");
						
					}else {
						System.out.print(" ");
					
				}
				
				
			}
				System.out.print(" ");
				
				
				//E
				for(int j=0;j<n;j++) {
					if(i==0 || i==n||i==(n-1)/2||j==0) {
						System.out.print("*");
						
					}else {
						System.out.print(" ");
					
				}
				
				
			}
				System.out.print(" ");
				//A
				
				for(int j=0;j<n;j++) {
					if(j==0 || j==(n-1)||i==0 ||i==(n-1)/2) {
						System.out.print("*");
						
					}else {
						System.out.print(" ");
					
				}
				
				
			}
				System.out.print(" ");
				
				
				//R
				
				for(int j=0;j<n;j++) {
					if(j==0&&i!=0 || i==0 || j==n-1 && i<=(n-1)/2|| i==(n-1)/2 ||i==j &&i>=(n-1)/2) {
						System.out.print("*");
						
					}else {
						System.out.print(" ");
					
				}
				
				
			}
				System.out.print(" ");
				System.out.println( );
			}
		}
}

