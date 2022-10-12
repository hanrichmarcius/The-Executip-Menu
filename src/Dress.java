
public abstract class Dress {

	private int fabricPrice;
	private String name, fabricType, ID;
	
	public Dress(int fabricPrice, String name, String fabricType, String iD) {
		super();
		this.fabricPrice = fabricPrice;
		this.name = name;
		this.fabricType = fabricType;
		ID = iD;
	}

	public int getFabricPrice() {
		return fabricPrice;
	}

	public void setFabricPrice(int fabricPrice) {
		this.fabricPrice = fabricPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFabricType() {
		return fabricType;
	}

	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public abstract void display();
	public abstract int calculateTotalPrice(int fabricPrice, int discountOrStock);

}
