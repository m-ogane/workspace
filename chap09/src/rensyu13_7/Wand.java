package rensyu13_7;

class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;

	}

	public void setName(String setName) {
		if (setName.length() < 3) {
			throw new IllegalArgumentException("名前は三文字で");
		}	this.name =	setName  ;

	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double setPower) {

		if (setPower > 100 || setPower <0.5) {
			throw new IllegalArgumentException("0.5以上で100以下");
		}else {
			this.power = setPower;
		}

	}

}
