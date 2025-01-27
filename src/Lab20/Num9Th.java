package Lab20;

public class Num9Th implements Runnable {
    Thread thrd;
    static Num9Cl ob1 = new Num9Cl();
    int a[];
    int ans;
    Num9Th(String name, int nums[]){
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }
    public void run(){
        System.out.println(thrd.getName() + " запуск");
        synchronized(ob1){
            ans = ob1.sumArray(a);
        }
        System.out.println("Сумма для " + thrd.getName() + ": " + ans);
        System.out.println(thrd.getName() + " завершение");
    }
}
