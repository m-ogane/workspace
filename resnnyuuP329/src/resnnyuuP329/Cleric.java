package resnnyuuP329;

import java.util.Random;

public class Cleric {
	String name;
	int nowHp = 50;
	final int MAX_HP = 50;
	int nowMp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		this.nowMp = -5;
		this.nowHp = this.MAX_HP;
		System.out.println("HPが回復した");
	}

	public int pray(int sec) {
		int r = new Random().nextInt(3);
		int x = r + sec;
		if (this.MAX_MP < x+this.nowMp) {
			int s = this.MAX_MP-this.nowMp;
		} else {
			int 	s=x;
		}
		this.nowMp += s ;
		return s;

	}

}
