package Lab20;

public class Num3Cl extends Thread{
    Num3Cl(String name){
        super(name);
        start();
    }
    public void run(){
        System.out.println(getName() + " начал исполнение");
        try {
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(400);
                System.out.println("В потоке " + getName() + " счетчик " + i);
            }
        }catch (InterruptedException e){
            System.out.println("Поток " + getName() + " приостановлен");
        }
        System.out.println("Поток " + getName() + " прекратил исполнение");
    }
}
