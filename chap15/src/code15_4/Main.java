package code15_4;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ;  i < 8000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);

		sb.append("World");
		sb.append("Of");
		sb.append("Java");
		System.out.println(sb.toString());
		
		
	}

}
