package Lab20;

public class Num1Cl implements Runnable {
String mess1;
Num1Cl(String name){
    mess1 = name;
}
public void run(){
    System.out.println("����� " + mess1 + " ����� ����������");
    try {
        for (int i = 0; i < 10 ; i++) {
            Thread.sleep(400);
            System.out.println("� ������ " + mess1 + " ������� " + i);
        }
    }catch (InterruptedException e){
        System.out.println("����� " + mess1 + " �������������");
    }
    System.out.println("����� " + mess1 + " ��������� ����������");
}

}