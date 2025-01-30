package Lab23.Num13;

public class Z2 {
	public static void main(String[] args) {
	MyTest isCheck = (n) -> (n >= 10 && n <= 20) || (n > 20 && n < 50);
		
		System.out.println("12 - "+isCheck.testing(12));
		System.out.println("10 - "+isCheck.testing(10));
		System.out.println("9 - "+isCheck.testing(9));
		System.out.println("20 - "+isCheck.testing(20));
		System.out.println("21 - "+ isCheck.testing(21));
		System.out.println("50 - "+ isCheck.testing(50));
	}

}
