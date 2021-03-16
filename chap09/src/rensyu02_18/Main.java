package rensyu02_18;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sankaku s1 = new Sankaku(5, 5);
		//	s1.(kei);
		System.out.println(s1.keisan());




		Sankaku2 s2 = new Sankaku2();
		//Snakaku2 s2 = new Sankaku2(100, 1.5);
		//System.out.println(s2.takasa*s2.teihen/2);

		s2.takasa = 100;
		s2.teihen = 1.5;
		System.out.println(s2.takasa*s2.teihen/2);
	}
}
