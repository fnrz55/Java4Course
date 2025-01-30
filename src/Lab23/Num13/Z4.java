package Lab23.Num13;

public class Z4 {
	public static void main(String[] args) {
		Ex1_1<Integer> factorial = n ->{
			int result = 1;
			for(int i = 1; i <= n; i++) {
				result = result * i;
			}
			return result;
		};
		
		int num1 = 5, num2 = 6;
		
		System.out.println("Факториал числа " +num1+": " + factorial.func(num1));
		System.out.println("Факториал числа " +num2+": " + factorial.func(num2));
	}

}
