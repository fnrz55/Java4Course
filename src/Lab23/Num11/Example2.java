package Lab23.Num11;

public class Example2 {
	public static void main(String[] args) {
		Example1 myClassCons = Example3::new;
		Example3 mc = myClassCons.func();
		System.out.println("Массив:");
		mc.getArray1();
	}

}
