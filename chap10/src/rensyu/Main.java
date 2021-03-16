package rensyu;

import code10_01.Hero;

public class Main {
	public static void main(String[] args) {

		Hero h = new Hero();

		PoisonMatango pm = new PoisonMatango('A');
		pm.attck(h);
		System.out.println(h.getHp());

	}
}