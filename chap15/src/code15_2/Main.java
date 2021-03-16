package code15_2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "Java and JavaScript";
		if(s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}else {
			System.out.println("文字列s1はJavaを含んでいません");
		}
		if(s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}else {
			System.out.println("文字列s1はJavaが末尾にありません");
		}

		if(s1.startsWith("Java")) {
			System.out.println("文字列s1は、Javaが先頭にあります");
		}else {
			System.out.println("文字列s1はJavaが先頭にありません");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は " + s1.indexOf("Java"));
		System.out.println("文字列a1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}

}
