package Lab23.Num5;

public class Example3 {
	public static void main(String[] args) {
		Example1<Integer> isFactor = (n, d) -> (n%d) == 0;
		if(isFactor.test(10,2))
			System.out.println("2 является делителем 10");
		System.out.println();
		
		Example1<Double> isFactorD = (n, d) -> (n%d) == 0;
		if(isFactorD.test(212.0, 4.0))
			System.out.println("4.0 является делителем 212.0");
		System.out.println();
		
		Example1<String> isIn = (a, b) -> a.indexOf(b) != -1;
		String str = "Обобщенный функциональный интерфейс.";
		System.out.println("Тестируемая строка: " + str);
		if(isIn.test(str, "face"))
			System.out.println("'face' найдено");
		else
			System.out.println("'face' не найдено");
		System.out.println();
	}
}
