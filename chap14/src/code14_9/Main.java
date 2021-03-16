package code14_9;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//	Hero.money = 100;
		Hero h1 = new Hero();
		Hero h2 = new Hero();
	//	h1.money += 300;
		Hero.setRandomMoney();
		System.out.println(h1.hp);
		System.out.println(Hero.money);
		System.out.println(Math.PI);
	}

}
