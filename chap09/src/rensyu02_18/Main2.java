package rensyu02_18;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Hanbaga h1 = new Hanbaga();
		Hanbaga h2 = new Hanbaga();

		
		
		
		

		h1.setName("チーズバーガー");
		h1.setKarori(95);
		h1.setGenka(5);

		h2.setName("レタスバーガー");
		h2.setKarori(50);
		h2.setGenka(1);


		System.out.println(h1.gatKarori()+h2.gatKarori());
	}

}
