package Lab20;

public class Num2Cl implements Runnable {
Thread thrd;
Num2Cl(String name){
    thrd=new Thread(this,name);
    thrd.start();
}
public void run(){
    System.out.println("����� " + thrd.getName() + " ����� ����������");
    try{
        for (int i = 0; i < 10 ; i++) {
            Thread.sleep(400);
            System.out.println("� ������ " + thrd.getName() + " ������� " + i);
        }
    }catch (InterruptedException e){
        System.out.println("����� " + thrd.getName() + " �������������");
    }
    System.out.println("����� " + thrd.getName() + " ��������� ����������");
}
}