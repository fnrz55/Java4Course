package Lab21.Num2;

//Имитация автоматизированного светофора
public class TrafficLightSimulator implements Runnable{
    private TrafficLightColor[] colors = TrafficLightColor.values();
    private TrafficLightColor color;
    public int colorIdx;
    boolean traficLightOff = false;
    boolean stop = false;
    int counter = 11;
    boolean changed = false;
    TrafficLightSimulator(int init) {
        colorIdx = init;
    }
    TrafficLightSimulator() {colorIdx = 0;}
    public void run(){
        while (!stop){
            try {
                timer(colors[colorIdx]);
            }catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor(){
        if(colorIdx == colors.length-1){
            colorIdx = 0;
            changed = true;
            return;
        }
        if(traficLightOff){
           colorIdx = 1;
            changed = true;
            notify();
        }else {
            colorIdx++;
            changed = true;
            notify();
        }
    }

    synchronized void waitForChange(){
        try{
            while(!changed)
                wait();
            changed = false;
        } catch(InterruptedException e){
            System.out.println(e);
        }
    }
    synchronized void timer(TrafficLightColor col) throws InterruptedException {
        System.out.println(col.getName());
        int sec = col.getDelay()/1000;
        while (sec != 0){
            System.out.println(sec);
            sec--;
            wait(1000);
            counter++;
            if (counter == 60){
                System.out.println("13:00 Светофор выключается");
                traficLightOff = true;
                wait(1000);
                counter = 0;
                color = colors[colorIdx];
                changed = true;
                break;
            }
        }
    }

    synchronized TrafficLightColor getColor(){
        return colors[colorIdx];
    }
    synchronized void cancel(){
        stop = true;
    }
}
