package Lab20;

public class Num7Cl implements Runnable {
int count;
Thread thrd;

static boolean stop = false;
static String currentName;
Num7Cl(String name){
    thrd = new Thread(this, name);
    count = 0;
    currentName = name;
}

public void run(){
    System.out.println("����� " + thrd.getName() + " ����� ����������");
    do {
        count++;
        if(currentName.compareTo(thrd.getName()) != 0){
            currentName = thrd.getName();
            System.out.println("� ������ " + currentName);
        }
    }while (!stop && count < 1000000);
    stop = true;
    System.out.println("����� " + thrd.getName() + " ��������� ����������");
}
}

