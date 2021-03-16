package rensyu02_18;

public class Sankaku {
	double teihen;
	double takasa;

	public double keisan () {
		double goukei = this.teihen*this.takasa/2;
		return goukei;
	}

	public Sankaku(double teihens , double takasas ) {
		this.teihen = teihens;
		this.takasa = takasas;
	}

}
