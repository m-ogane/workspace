package code16_002;

import java.util.ArrayList;
import java.util.List;

public class Hero {
	private String name;


	public Hero(String name) {
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
		List<Hero> l = new ArrayList<>();
		l.add(h1);
		l.add(h2);
		for(Hero h : l )
		System.out.println(h.getName());
		}

}

