package Lab23.Num1;
import java.lang.Math.*;

public class Example3 {
	public static void main(String[] args) {
		Example1 myVal;
		myVal = () -> 98.6;
		System.out.println("ѕосто€нное значение "+myVal.Example1());
		Example2 myPval = (n) -> 1.0/n;
		System.out.println("ќбратна€ величина 4 равна " + myPval.getValue(4.0));
		System.out.println("ќбратна€ величина 8 равна " + myPval.getValue(8.0));
		myVal = () -> 5.0; //возвращаемое значение должно быть double
//		myPval = () -> Math.random(); //интерфейс требует метод с одним аргументом double, а не без аргументов.
	}
}
