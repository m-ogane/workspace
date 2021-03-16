package rensyu02_18;

public class Javacode04_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] name = { "山田", "佐々木", "鈴木", "田中", "高橋" };
		int[] age = { 23, 35, 52, 33, 47 };
		String[] city = { "東京", "神奈川", "埼玉", "東京", "神奈川" };
		//	System.out.println("氏名"+"\t"+"年齢"+"\t"+"住所");
		System.out.println("番号" + "氏名" + "\t" + "年齢" + "\t" + "住所");
		System.out.println("-----------------------------------");

		for (int i = 0; i < 5; i++) {
			int x = i+1;
			//System.out.println(name[i]+"\t"+age[i]+"\t"+city[i]);
			System.out.println("K-" + x + "\t" + name[i] + "\t" + age[i] + "\t" + city[i]);

		}

	}
}