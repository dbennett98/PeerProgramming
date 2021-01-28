package com.qa.Goldilocks;

public class Chair {
int chairNum;
int chairTemp;
int chairWeight;



public Chair(int chairNum, int chairTemp, int chairWeight) {
	super();
	this.chairNum = chairNum;
	this.chairTemp = chairTemp;
	this.chairWeight = chairWeight;
}

public int getChairNum() {
	return chairNum;
}

public void setChairNum(int chairNum) {
	this.chairNum = chairNum;
}

}
