public class UseCalculator {

	public static void main(String[] args) {
		Calculator add=(x,y)->x+y;
		System.out.println(add.math(30, 48));
		Calculator mul=(r,s)->{return (r*s);};
		System.out.println(mul.math(34, 026));
		
		
		Calculator m=(a,b)->{
			if(a>b) {
			return a;
		}
		else {
			return b;
		}
		};
		System.out.println(m.math(23, 67));
		}

	}

