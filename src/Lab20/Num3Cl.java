package Lab20;

public class Num3Cl extends Thread{
    Num3Cl(String name){
        super(name);
        start();
    }
    public void run(){
        System.out.println(getName() + " ����� ����������");
        try {
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(400);
                System.out.println("� ������ " + getName() + " ������� " + i);
            }
        }catch (InterruptedException e){
            System.out.println("����� " + getName() + " �������������");
        }
        System.out.println("����� " + getName() + " ��������� ����������");
    }
}
