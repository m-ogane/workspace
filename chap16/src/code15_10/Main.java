package code15_10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long start = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 8000000; i++) {
			sb.append("Java");
		}
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒です");
		 start = System.currentTimeMillis();

		 s = "Java";
		for (int i = 0; i < 800; i++) {
			s = s+"Java";

		}
		 end = System.currentTimeMillis();
		 long end2 = end -start;
		 System.out.println("+演算子の結合にかかった時間は" + (end2) + "ミリ秒です");
		System.out.println("処理にかかった時間はStringBuilderで処理にかかった時間の\n"  +(end );

	}



}
