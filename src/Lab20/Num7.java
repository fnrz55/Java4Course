package Lab20;

public class Num7 {

	public static void main(String[] args) {
		System.out.println("�������� ����� �������");
		
		Num7Cl mt1 = new Num7Cl("������� ���������");
		Num7Cl mt2 = new Num7Cl("������ ���������");
		mt1.thrd.start();
		mt2.thrd.start();
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		}catch(InterruptedException exc) {
			System.out.println("������� ����� �������������");
		}
		System.out.println("����� � ������� ����������� ��������� " + mt1.count);
		System.out.println("����� � ������ ����������� ��������� " + mt2.count);

	}

}
