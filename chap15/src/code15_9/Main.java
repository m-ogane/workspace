package code15_9;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.setName("アサカ");
		h.setJob("ヒーロー");
		h.setGold(5555);
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format("%-9s %-13s 所持金%,6d", h.getName(), h.getJob(), h.getGold());
		System.out.println(s);
}

}
