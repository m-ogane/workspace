package car;

public abstract class Cars {
	private String name;
	private int prs;
	private double nenpi;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPrs(int prs) {//万円
		this.prs = prs;

	}

	public int getPrs() {
		return this.prs;
	}

	public void setNenpi(double nenpi) {
		this.nenpi = nenpi;
	}

	public double getNenpi() {
		return nenpi;
	}
//	public Cars(int prs) {
//		if (10 > prs) {
//			throw new IllegalArgumentException("価格は10万円以上で");
//		} else {
//			this.prs = prs;
//					}


	public Cars(String name, int prs, double nenpi) {
		this.name = name;
		this.nenpi = nenpi;
		if (10 > prs) {
			throw new IllegalArgumentException("価格は10万円以上で");
		} else {
			this.prs = prs;

		}

	}

	public abstract void syurui();

	public abstract void run();

	public abstract void stop();

}
