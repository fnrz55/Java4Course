package Lab23.Num9;

public class Example2 {
	static boolean numTest(Example1 p, int v) {
		return p.test(v);
	}
	
	public static void main(String[] args) {
		boolean result;
		result = numTest(Example3::isPrime, 17);
		if(result) System.out.println("17 - простое число");
		result = numTest(Example3::isEven, 12);
		if(result) System.out.println("12 - четное число");
		result = numTest(Example3::isPositive, 11);
		if(result) System.out.println("11 - положительное число");
	}

}