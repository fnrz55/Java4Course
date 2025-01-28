package Lab20;

public class Num7 {

	public static void main(String[] args) {
		System.out.println("Основной поток запущен");
		
		Num7Cl mt1 = new Num7Cl("Высокий приоритет");
		Num7Cl mt2 = new Num7Cl("Низкий приоритет");
		Num7Cl mt3 = new Num7Cl("Child1");
		Num7Cl mt4 = new Num7Cl("Child2");
		mt1.thrd.start();
		mt2.thrd.start();
		mt3.thrd.start();
		mt4.thrd.start();

		mt1.thrd.setPriority(Thread.MAX_PRIORITY);
		mt2.thrd.setPriority(Thread.MIN_PRIORITY);
		mt3.thrd.setPriority(Thread.MAX_PRIORITY - 2);
		mt4.thrd.setPriority(Thread.MIN_PRIORITY + 2);

		try {
			mt1.thrd.join();
			mt2.thrd.join();
			mt3.thrd.join();
			mt4.thrd.join();
		}catch(InterruptedException exc) {
			System.out.println("Главный поток приостановлен");
		}
		System.out.println("Поток с высоким приоритетом считается " + mt1.count);
		System.out.println("Поток с низким приоритетом считается " + mt2.count);
		System.out.println("Поток Child1 считается " + mt3.count);
		System.out.println("Поток Child2 считается " + mt4.count);

	}

}
