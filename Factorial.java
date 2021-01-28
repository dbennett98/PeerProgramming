package com.qa.PeerProgramming;

public class Factorial {
	int num;
	public Factorial(int num) {
		this.num = num;
	}

	public void calculate(int num) {
		int output = num;
		for(int i=2; i<=num; i++) {
			output = output/ i;
			if (output ==1) {
				System.out.println(i + "!");
				break;
			}
		}
}
}
