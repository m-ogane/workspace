package code14_3;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println(h.toString());
		Hero h2 = new Hero();
		h2.name ="ミナト";
		h2.hp = 100;
		if(h.equals(h2)){
			System.out.println("同じ内容です");
		}else
		{
			System.out.println("違う内容です");
		}
	}



}
