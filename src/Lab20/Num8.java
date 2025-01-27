package Lab20;

public class Num8 implements Runnable {
    int ans;
    Thread thrd;
    static Num8Cl ob1 = new Num8Cl();
    int a[];
    Num8(String name, int nums[]){
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();
    }
    public void run(){
        int sum;
        System.out.println("Поток " + thrd.getName() + " начал исполнение");
        ans=ob1.sumArray(a);
        System.out.println("Сумма для " + thrd.getName() + "= "+ans);
        System.out.println("Поток " + thrd.getName() + " прекратил исполнение");
    }
}