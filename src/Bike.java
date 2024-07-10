
public interface Bike {
	
	public String RegNum(String a);
	
	public static int NetPrice(int p) {
		return p+(p*15/100);
	}
	
	public default String model(String a) {
		return "Bike model is "+a;
	}

}
