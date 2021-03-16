package car;

public class KogataTrack extends Tracks {

	public KogataTrack(String name, int prs, double nenpi) {
		super(name, prs, nenpi);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void syurui() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("■小型トラック");
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("普通に走る");
	}

	@Override
	public void stop() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("普通に停まる");
	}

	@Override
	public void kinou() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("荷物をやや積む");
	}

}
