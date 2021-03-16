package rensyu;

import code10_01.Hero;

public class Matango {
	int hp = 50;
	char suffix;
	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attck(Hero h) {
	//public void attck() {
	System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}

}
