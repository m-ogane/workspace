package code02_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//System.out.println("私の好きな記号は二重引用符(\")です");

		//問題１
		int teihen = 5;//底辺を入れる
		int takasa = 7;//高さを入れる
		//duble menseki = (teihen*takasa)/2;
		final double waru = 2;

		System.out.println("三角形の面積は" + (teihen * takasa) / waru + "cm");
		System.out.println("三角形の面積は" + (teihen * takasa) / waru + "cm");

		//問題２

		int syozikin = 20_000;
		int wainTanka = 3_500;

		System.out.println("サネヨシさんは" + syozikin / wainTanka + "本のワインが購入可能");
		System.out.println("所持金は\\" + syozikin % wainTanka + "円余ります");
	}

}
