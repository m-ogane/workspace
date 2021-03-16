package p453;

public abstract class TangibleAsset extends Asset implements Thing{

	String color;
	double weight;

	public TangibleAsset(String name, int price, String color,double weight) {
		super(name, price);
		this.color = color;
	}
	/**
	 * @return name
	 */
	public String getColor() {
		return color;
	}

	@Override
	public double getWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return this.weight;
	}

	@Override
	public void setWeight(double weight) {
		// TODO 自動生成されたメソッド・スタブ
		this.weight = weight;
	}


}
