package Lab23.Num2;

public class Example3 {
	public static void main(String[] args) {
		Example1 isF = (n,d) -> (n % d) == 0;
		if(isF.test(10, 2))
			System.out.println("2 является делителем 10");
		if(!isF.test(10, 3))
			System.out.println("3 НЕ является делителем 10");
		System.out.println();
		
		Example1 lessThan = (n,m) -> (n < m);
		if(lessThan.test(2, 10))
			System.out.println("2 меньше 10");
		if(!lessThan.test(10, 2))
			System.out.println("10 не меньше 2");
		System.out.println();
		
		Example1 absEqual = (n,m) -> (n <0? -n : n) == (m <0 ? -m:m);
		if(absEqual.test(4,-4))
			System.out.println("Абсолютные величины 4 и -4 равны");
		if(!lessThan.test(4,-5))
			System.out.println("Абсолютные величины 4 и -5 не равны");
			
	}

}
