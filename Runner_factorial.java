package com.qa.PeerProgramming;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Factorial factorial = new Factorial(num);
		factorial.calculate(num);
	}

}
