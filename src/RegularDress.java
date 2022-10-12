
public class RegularDress extends Dress {
	
	private int discount;
	
	public RegularDress(int fabricPrice, String name, String fabricType, String iD, int discount) {
		super(fabricPrice, name, fabricType, iD);
		this.discount = discount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.printf("| %s | %-20s | Rp. %-8d | %-11s | %-7d%% |   -   | Rp. %-7d |\n", getID(), getName(), getFabricPrice(), getFabricType(), discount, calculateTotalPrice(getFabricPrice(), discount));
	}

	@Override
	public int calculateTotalPrice(int fabricPrice, int discountOrStock) {
		// TODO Auto-generated method stub
		return (fabricPrice + 50000) * ((100 - discount) / 100);
	}
}
