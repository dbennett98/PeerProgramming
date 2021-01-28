package com.qa.Goldilocks;

public class Runner {

	public static void main(String[] args) {
		
		DiningRoom a = new DiningRoom();
		Chair chair1 = new Chair(1,297, 90);
		Chair chair2 = new Chair(2,66, 5);
		Chair chair3 = new Chair(3,257, 113);
		Chair chair4 = new Chair(4,276, 191);
		Chair chair5 = new Chair(5,280,129);
		a.addChair(chair1);
		a.addChair(chair2);
		a.addChair(chair3);
		a.addChair(chair4);
		a.addChair(chair5);
		a.compareChair();
	}

}
