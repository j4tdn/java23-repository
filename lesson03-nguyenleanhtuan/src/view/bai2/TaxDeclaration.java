package view.bai2;

public class TaxDeclaration {
	private double tax;


	public TaxDeclaration() {
	}

	public TaxDeclaration(double tax) {
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "TaxDeclaration [tax=" + tax + "]";
	}

	public double calculateTaxRate(int dungtich, double giaxe) {
		if (dungtich < 100) {
			return giaxe * 0.01;
		} else if (dungtich <= 200) {
			return giaxe * 0.03;
		} else {
			return giaxe * 0.05;
		}
	}
}
