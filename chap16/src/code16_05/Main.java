package code16_05;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s : words) {
			System.out.print(s + "→");
		}

		Set<String> i = new TreeSet<String>();
		i.add("湊");
		i.add("朝香");
		i.add("菅原");
		i.add("田中");
		for (String s : i) {
			System.out.print(s + "→");
		}
	}
}