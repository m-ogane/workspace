package code08_02;

public class Code9_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;
		Hero h2 = new Hero();
		h2 =h1 ;
		h2.hp = 200;
		System.out.println(h1.hp);
		System.out.println(h2.hp);
		
	}

}
