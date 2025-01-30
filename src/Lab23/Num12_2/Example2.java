package Lab23.Num12_2;

public class Example2 {
	public static void main(String[] args) {
		Example1<Thread> myArray = Thread[]::new;
		Thread[] trd1 = myArray.func(7);
		
		for (int i = 0; i < trd1.length; i++) {
            final int index = i;
            trd1[i] = new Thread(() -> System.out.println("Поток " + index + " создан"));
            trd1[i].start();  
        }
	}
	

}
