package code16_06;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, Integer>prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都");
		System.out.println("東京の人口は、" + tokyo);
		int kumamot = prefs.get("熊本県");
		int kyouto = prefs.get("京都府");
		System.out.println(kyouto);
		System.out.println(kumamot);
		prefs.remove("京都府");
		prefs.put("熊本県",182);
		int kumamot1 = prefs.get("熊本県");
//		int kumamot = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamot1);


	}
}