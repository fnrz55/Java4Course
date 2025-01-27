package Lab20;

public class Num7 {

	public static void main(String[] args) {
		System.out.println("Основной поток запущен");
		
		Num7Cl mt1 = new Num7Cl("Высокий приоритет");
		Num7Cl mt2 = new Num7Cl("Низкий приоритет");
		mt1.thrd.start();
		mt2.thrd.start();
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}catch(InterruptedException exc) {
			System.out.println("Главный поток приостановлен");
		}
		System.out.println("Поток с высоким приоритетом считается " + mt1.count);
		System.out.println("Поток с низким приоритетом считается " + mt2.count);

	}

}
