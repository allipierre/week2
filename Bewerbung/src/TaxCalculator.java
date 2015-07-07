public class TaxCalculator implements InterfaceTax {

	String item;
	int tax;
	double price;

	public TaxCalculator(String item1, int tax1, double price1) {
		this.item = item1;
		this.tax = tax1;
		this.price = price1;

	}

	@Override
	public double netSum() {

		return (this.price / this.tax);
	}

	@Override
	public int taxe() {

		return this.tax;
	}

	@Override
	public double totalSum() {

		return this.price;
	}

	public String printItem() {

		return this.item;

	}

	public String toString() {
		return this.printItem();

	}

}
