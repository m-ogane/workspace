package code15_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();

		for(int i = 1 ; i <=100 ; i++) {
			sb.append(i + ",");
//			sb.append(i );
//			sb.append(",");


		}
			String s =sb.toString();
			System.out.println(s);
			String[] a = s.split(",");
			for(String aa : a) {
				System.out.println(aa);

			}

	}

}
