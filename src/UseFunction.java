import java.util.function.Function;

public class UseFunction {
	public static void main(String args[]) {

	Function<String,Integer>StringToInteger=Integer::valueOf;
	
	Integer result=StringToInteger.apply("1235");
	System.out.println(result);
	}
	
}
