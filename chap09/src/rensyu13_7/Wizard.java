package rensyu13_7;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public int getHp() {
		return this.hp;
	}

	public void setHp(int setHp) {

		if (setHp <= -1) {
			setHp = 0;
			if (setHp < 0) {
				throw new IllegalArgumentException("0以上");
			}
		} else {
			this.hp = setHp;	

		}
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int setMp) {
		if (setMp < 0) {
			throw new IllegalArgumentException("0以上");
		}
		this.mp = setMp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String setName) {

		if (setName.length() < 3) {
			throw new IllegalArgumentException("名前は3文字以上で");

		}
		this.name = setName;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}

	Hero h = new Hero();

	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した!");
	}

}
