import java.util.function.Predicate;
public class UsePredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> isPositive=(x)-> x>0;
		boolean result=isPositive.test(5);
		System.out.println(result);

	}

}
