package Lab20;

public class Num4 {
    public static void main(String[] args) {
    	System.out.println("�������� ����� �������");
        Num3Cl mt1 = new Num3Cl("#child1");
        Num3Cl mt2 = new Num3Cl("#child2");
        Num3Cl mt3 = new Num3Cl("#child3");
        for (int i = 0; i < 50 ; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e ){
                System.out.println("������� ����� �������������");
            }
        }
        System.out.println("������� ����� �������� ����������");
    }

}
