package Lab23.Num12;

import java.util.function.Predicate;

public class Example2 {
	public static void main(String[] args) {
		Predicate<Integer> isEven = (n) -> (n%2)==0;
		if(isEven.test(4)) System.out.println("4 - ������ �����");
		if(!isEven.test(5)) System.out.println("5 - �������� �����");
	}

}
