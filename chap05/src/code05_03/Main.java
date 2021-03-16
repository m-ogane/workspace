package code05_03;

public class Main {
	public static void methodA() {
		System.out.println("methodA");
		methodB();
		methodD();

	}

	public static void methodB() {
		System.out.println("methodB");
	}

	public static void main(String[] args) {
		methodA();
		// TODO 自動生成されたメソッド・スタブ
			methodC();
	}	public static void methodC() {
		System.out.println("methodC");


	}
	public static void methodD() {
	System.out.println("methodD");
	}

}