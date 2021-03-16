package car;

public class TyugataTrack extends Tracks {



	public TyugataTrack(String name, int prs, double nenpi) {
		super(name, prs, nenpi);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void syurui() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("■中型トラック");
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
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("荷物をぼちぼち積む");
	}

}
