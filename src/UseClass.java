
public class UseClass {

	public static void main(String[] args) {
		//MyClass mc=new MyClass();
		Calculator c=MyClass::findMax;
		System.out.println(c.math(30, 20));
		

	}

}
