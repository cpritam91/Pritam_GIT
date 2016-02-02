package DesigningClasses;

public class TaxWhiz {

	private double currentTaxRate;
	
	public TaxWhiz() {
		super();
	}
	
	public TaxWhiz(double currentTaxRate) {
		super();
		this.currentTaxRate = currentTaxRate;
	}
	
	public double getCurrentTaxRate() {
		return currentTaxRate;
	}
	
	public void setCurrentTaxRate(double currentTaxRate) {
		this.currentTaxRate = currentTaxRate;
	}
	
	public double calcTax(double purchase)
	{
		return 0.01 * purchase * currentTaxRate;
	}
}
