package code03_08;

public class Main {

	public static void main(String[] args) {
		//int i; 
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < 3; i++) {
		//	System.out.println("現在" + (i + 1) + "周目→");
		}
		//		for (int i = 0; i < 3; i++) {
		//			System.out.print("いま" +( i + 1) + "周目→");
		//	}
		//		}
		for (int i = 1; i < 10; i++) {
			System.out.println("現在" + (i + 1) + "周目→");
		}
		for (int i = 10; i > 0; i--) {
			System.out.println("現在" + (i + 1) + "周目→");
		}
		int i = 0;
		for (; i < 10; i++) {
			System.out.println("現在" + (i + 1) + "周目→");
		}
		for (i = 0; i < 10;) {
			System.out.println("現在" + (i + 1) + "周目→");
			i++;
		}
	}

}
