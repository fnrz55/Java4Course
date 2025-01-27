package Lab20;

public class Num10Th implements Runnable {
    Thread thrd;
    Num10Cl ttob;
    Num10Th(String name, Num10Cl tt){
        thrd = new Thread(this, name);
        ttob = tt;
        thrd.start();
    }
    public void run(){
        if(thrd.getName().compareTo("tick") == 0){
            while (true)ttob.tick(true);
        }else {
            while (true)ttob.tock(true);
        }

    }
}
