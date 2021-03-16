package code00;

public class Hero extends Character {
	int hp;

	@Override
	public void ruu() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.name + "は逃げ出した");
	}

	public void attack() {
		System.out.println("敵に5のダメージ");
	}

}
