import java.util.Optional;
public class SampleOptionalClass {

	public static void main(String[] args) {
		String a="-:)(:- sasi -:)(:-";
		
	   Optional<String>op=Optional.of("Sasi");
		System.out.println(op);
		
       Optional<String>p=Optional.ofNullable(null);
       System.out.println(p);
       
       Optional<String>o=Optional.empty();
       System.out.println(o);
       
       Optional<String>os=Optional.ofNullable("----sasi----");
       if(os.isPresent()) {
    	   System.out.println(a.toUpperCase());
       }
       else {
    	   System.out.println("Value is empty");
       }
       System.out.println(os.orElse("Value is empty"));
	}

}
