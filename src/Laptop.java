
public interface Laptop {
	public String LaptopBrand(String brand);
	public static int LaptopPrice(int price) {
		int NetPrice=(price*10/100)+price;
		return NetPrice;
	}
	public default String laptopModel(String model) {
		return model+" is Working Professional Model";
	}
	

}
