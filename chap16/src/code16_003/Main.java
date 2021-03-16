package code16_003;

import java.util.HashMap;
import java.util.Map;

import code16_002.Hero;

public class Main {

	private String name;

	public Main(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> l = new HashMap<>();
		l.put(h1, 3);
		l.put(h2, 7);
		for (Hero hoge : l.keySet()) {
			int ikiro = l.get(hoge);
			System.out.println(hoge.getName() + ikiro);

		}
	}

}