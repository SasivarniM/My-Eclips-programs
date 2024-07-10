import java.util.function.Supplier;

public class UseSupplier {

	public static void main(String[] args) {

		Supplier<Double>randomsupplier=Math::random;
		Double randomvalue=randomsupplier.get();
		System.out.println(randomvalue);
		
	}

}
