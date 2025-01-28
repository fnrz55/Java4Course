package Lab21.Num2;

public class TrafficLightDemo {
    public static void main(String args[]) throws InterruptedException {
        TrafficLightSimulator tl = new TrafficLightSimulator(2);
        Thread thrd = new Thread(tl);
        thrd.start();

        for(int i = 0; i < 9; i++){
            tl.waitForChange();
        }
        tl.cancel();
    }
}
