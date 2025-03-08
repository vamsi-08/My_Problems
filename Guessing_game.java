package com.cdacpractice;

public class Guessing_game {

	public static void main(String[] args) {
		int n=(int)(Math.random()*101);
		java.util.Scanner s=new java.util.Scanner(System.in);
		 System.out.println("enter your guess from 1 - 100");
		int guess=s.nextInt();
		while(guess!=n) {
			if(guess>n) {
				System.out.println("Too high !....guess again");
				guess=s.nextInt();
			}
			else 
				if(guess<n) {
				System.out.println("Too low...! guess again");
				guess=s.nextInt();
			}
		}
		System.out.println("Congrats you won!....");
		
}
}