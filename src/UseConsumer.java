import java.util.function.Consumer;

public class UseConsumer {

	public static void main(String[] args) {
		Consumer<String> printMessage= System.out::println;
		
		printMessage.accept("Welcome to Our WebPage");
	}

}
