package Lab20;

public class Num2 {
    public static void main(String[] args) {
        System.out.println("�������� ����� �������");
        Num2Cl mt = new Num2Cl("#Child2");
        Thread thrd = new Thread(mt);
        thrd.start();
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
