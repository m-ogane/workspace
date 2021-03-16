package car;

public class Keicar extends Cars{

	public Keicar(String name, int prs, double nenpi) {
		super(name, prs, nenpi);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void syurui() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("■軽自動車");

	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("燃費良く走る");
	}

	@Override
	public void stop() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("燃費良く停まる");
	}

}
