
public class LimitedEditionDress extends Dress {
	
	private int stock;

	public LimitedEditionDress(int fabricPrice, String name, String fabricType, String iD, int stock) {
		super(fabricPrice, name, fabricType, iD);
		this.setStock(stock);
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.printf("| %s | %-20s | Rp. %-8d | %-11s | %-7d%% |   -   | Rp. %-7d |\n", getID(), getName(), getFabricPrice(), getFabricType(), stock, calculateTotalPrice(getFabricPrice(), stock));
	}

	@Override
	public int calculateTotalPrice(int fabricPrice, int discountOrStock) {
		// TODO Auto-generated method stub
		return fabricPrice + 50000 + ((10 - stock) * 10000);
	}
}
