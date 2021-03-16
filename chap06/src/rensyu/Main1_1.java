package rensyu;

public class Main1_1 {

	public static void main(String[] args) {
		String[] name = { "山田", "太田", "鈴木", "田中", "高橋" };
		String[] sibet = { "女", "男", "女", "男", "男" };
		String[] ado = { "東京", "埼玉", "東京", "神奈川", "埼玉" };
		System.out.println("都道府県の入力をしてください");
		String kaku = new java.util.Scanner(System.in).nextLine();
		System.out.println("住所録");
		System.out.println("氏名" + "\t" + "性別" + "\t" + "住所" + "\t");
		System.out.println("-----------------------");
		for (int i = 0; i < 5; i++) {
			//System.out.println(name[i] + "\t" + sibet[i] + "\t" + ado[i] + "\t");
			if (kaku.equals(ado[i])) {
				//	System.out.println("*");
				System.out.println("*" + name[i] + "\t" + sibet[i] + "\t" + ado[i] + "\t");
			} else {
				System.out.println(name[i] + "\t" + sibet[i] + "\t" + ado[i] + "\t");
			}
		}

	}

}
