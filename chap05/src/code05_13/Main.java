package code05_13;

public class Main {

	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = { 1, 2, 3 };
		incArray(array);
//		for (int i = 0; i < array.length; i++) {
		for (int i : array) {
			System.out.println(i);
		}
		
	}
		
}
