package DesigningClasses;

public class TaxWhizApplication {

	public static void main(String[] args) {
		
		TaxWhiz tobj = new TaxWhiz(12.5);
		
		System.out.println(" Total Tax : " + tobj.calcTax(500));
		
	}

}
