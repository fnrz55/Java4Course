package Lab20;

public class Num10Cl {
    String state;
    synchronized void tick(boolean run1){
        if(!run1){
            state = "tick";
            notify();
            return;
        }
        System.out.println("tick");
        state = "tick";
        notify();
        try {
            Thread.sleep(500);
            while (!state.equals("tack")){
                wait();
            }
        }catch (InterruptedException e){
            System.out.println("Прерывание потока");
        }
    }
    synchronized void tock(boolean run1){
        if(!run1){
            state = "tack";
            notify();
            return;
        }
        System.out.println("tack");
        state = "tack";
        notify();
        try {
            Thread.sleep(500);
            while (!state.equals("tick")) {
                wait();
            }
        }catch (InterruptedException e){
            System.out.println("Прерывание потока");
        }
    }
}