package code16_08;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		System.out.println(list.get(0).name);

		h.name = "スガワラ";
		System.out.println(list.get(0).name);
	}
}
