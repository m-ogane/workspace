package code15_7;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = "abc,def,ghi";
		String words = s.replaceAll("[beh]","X");
		String o = s.replace("[beh]","X");
		String w = s.replaceFirst("[;]", "X");
		System.out.println(words);
		System.out.println(w);
		System.out.println(o);
	}

}
