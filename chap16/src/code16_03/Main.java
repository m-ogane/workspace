package code16_03;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> colors = new HashSet<String>();
		colors.add("赤");

		colors.add("赤色");
		colors.add("黄");

		colors.add("青");

		System.out.println("色は" + colors.size() + "種類");
		for(String s : colors) {
			System.out.print(s + "→");
		}

	}

}
