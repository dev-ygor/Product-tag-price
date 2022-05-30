package entities;

public class ImportedProduct extends Product {
	
	private double customsFee;

	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return (price + customsFee);	
	}
	
	@Override
	public String priceTag() {
		return super.name + " R$ "
				+ totalPrice() 
				+ " (Customs fee: R$ "
				+ customsFee + ")";
	}
				
	
	
	
	
}
