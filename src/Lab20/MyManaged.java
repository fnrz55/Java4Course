package Lab20;

public class MyManaged{
    public static void main(String[] args){
        Thread thrd;
        thrd =Thread.currentThread();
        System.out.println("��� ��������� ������: "+thrd.getName());
        System.out.println("���������: "+thrd.getPriority());
        System.out.println();
        System.out.println("��������� ����� � ����������\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);
        System.out.println("����� ��� ��������� ������"+thrd.getName());
        System.out.println("����� �������� ����������"+thrd.getPriority());
    }
}
