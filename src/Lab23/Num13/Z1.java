package Lab23.Num13;

import java.util.function.Predicate;

public class Z1 {
	public static void main(String[] args) {
		Predicate<Integer> isCheck = (n) -> (n >= 10 && n <= 20) || (n > 20 && n < 50);
		
		System.out.println("12 - "+isCheck.test(12));
		System.out.println("10 - "+isCheck.test(10));
		System.out.println("9 - "+isCheck.test(9));
		System.out.println("20 - "+isCheck.test(20));
		System.out.println("21 - "+ isCheck.test(21));
		System.out.println("50 - "+ isCheck.test(50));
	}

}
