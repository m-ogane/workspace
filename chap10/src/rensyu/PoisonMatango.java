package rensyu;

import code10_01.Hero;

public class PoisonMatango extends Matango {
	int atccksuu = 5;

	public PoisonMatango(char s) {
		super(s);
	}

	public void attck(Hero h) {
	//	public void attck() {
		//		for(int i =  5 ; i < 0 ; i--)
		super.attck(h);
	//	super.attck();
		//	if (this.atccksuu != 0) {
		if (this.atccksuu > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			//int dmg = (int) (h.hp/0.2) ;
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージda");
			this.atccksuu--;
		} else {
		}
	}

}
