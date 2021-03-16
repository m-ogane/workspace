package rensyuu3_1;

public class Ren3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int isHungry = 0;
		//		int isHungry = 1;
		String food = "お寿司";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("おなかいっぱいです");
			//	System.out.println(isHungry == 0 ? "お腹がいっぱいです" : "はらぺこです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");

	}
}
