package car;

public class Kyancar extends Cars {

	public Kyancar(String name, int prs, double nenpi) {
		super(name, prs, nenpi);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void syurui() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("■キャンピングカー");
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

	public void kinou() {
		System.out.println("ここをキャンプ地とする");
		// TODO 自動生成されたメソッド・スタブ

	}

}
