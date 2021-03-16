package code05_12;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = { 1, 2, 3, 4, 5 };
		printArray(array);//配列を渡す
		for (int a : array) {
		System.out.println(a);
		}
	}

	
	// int 型配列　を受け取り、すべての要素を表示するメゾット
	public static void printArray(int[] ray) {
		ray[0] = 10;
		for (int e : ray) {// 拡張for文
			System.out.println(e);
		}
	}

}
