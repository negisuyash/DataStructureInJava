package com.daa.problems;

public class TowerOfHanoi {
	
	public void move(char from,char to) {
		System.out.println("move from "+from+" to "+to);
	}
	
	public void moveVia(char from,char to,char via) {
		this.move(from,via);
		this.move(via, to);
	}
	
	public void hanoi(int numberOfDisk,char from,char via,char to) {
		if(numberOfDisk==0) {
			return;
		}
		hanoi(numberOfDisk-1,from,to,via);
		move(from,to);
		hanoi(numberOfDisk-1,via,to,from);
	}

}
