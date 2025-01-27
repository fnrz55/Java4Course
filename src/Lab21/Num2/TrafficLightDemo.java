package Lab21.Num2;

public class TrafficLightDemo {
    public static void main(String args[]) throws InterruptedException {
        TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thrd = new Thread(tl);
        thrd.start();

        for(int i = 0; i < 9; i++){
            System.out.println(tl.getColor());
            tl.timer(tl.getColor());
            tl.waitForChange();

        }
        tl.cancel();
    }
}
