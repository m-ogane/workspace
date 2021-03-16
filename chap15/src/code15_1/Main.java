package code15_1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 ="スッキリJava";
		String s2 = "Java";
		String s3 = "Java";
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}else {
			System.out.println("等しくない");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}else {

		}
		System.out.println("s1の長さは" + s1.length() + "です");
		if(s1.isEmpty()) {

			System.out.println("s1は空文字です");


		}
		System.out.println(s2.matches("Java"));
		System.out.println(s2.matches("Javajava"));
		System.out.println(s2.matches("java"));;
		System.out.println(s2.matches("J..."));
		System.out.println(s2.matches("Ja*va"));
		System.out.println(s2.matches(".*"));
		System.out.println(s2.matches("Ja.*"));
		System.out.println(s2.matches(".*Ja"));






	}


}
