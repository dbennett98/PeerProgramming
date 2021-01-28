package com.qa.Goldilocks;

import java.util.ArrayList;
import java.util.List;

public class DiningRoom {
	public List<Chair> chairList = new ArrayList<Chair>();
	
	public void addChair(Chair c) {
		chairList.add(c);
	}
	public void compareChair () {
		int output = 0;
		for (int i = 0 ; i<chairList.size();i++) {
			if (chairList.get(i).chairWeight <100 && chairList.get(i).chairTemp<80) {
				output++;
			}
		} System.out.println(output);
	}
}
