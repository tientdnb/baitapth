package school.Entity;

public class Product {
	private short id;
	private String name;
	private String produce;
	private ProductType productType;
	public static short count = 0;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, String produce, ProductType productType) {
		count++;
		this.id = count;
		this.name = name;
		this.produce = produce;
		this.productType = productType;
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduce() {
		return produce;
	}

	public void setProduce(String produce) {
		this.produce = produce;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	@Override
	public String toString() {
		return "[id: " + id + " | " + "name: " + name + " | " + "produce: " + produce + " | " + "productType: " + productType.getId() + "]";
	}
}
