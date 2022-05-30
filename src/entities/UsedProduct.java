package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product {
	
	private Date manuFactureDate;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manuFactureDate) {
		super(name, price);
		this.manuFactureDate = manuFactureDate;
	}

	public Date getManuFactureDate() {
		return manuFactureDate;
	}

	public void setManuFactureDate(Date manuFactureDate) {
		this.manuFactureDate = manuFactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.name + " (used) R$ "
				+ super.price
				+ " (Manufacture date: "
				+ sdf.format(manuFactureDate)
				+ ")";
	}

}
