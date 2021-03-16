package car;

public class OgataTracks extends Tracks {

	public OgataTracks(String name, int prs, double nenpi) {
		super(name, prs, nenpi);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void syurui() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("■大型トラック");
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ゴトゴト走る");
	}

	@Override
	public void stop() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ゴトゴト停まる");
	}

	@Override
	public void kinou() {
		System.out.println("荷物をめっちゃ積む");
		// TODO 自動生成されたメソッド・スタブ
	}

}
