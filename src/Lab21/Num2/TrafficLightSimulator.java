package Lab21.Num2;
import java.util.Timer;
enum TrafficLightColor{RED(12000), GREEN(10000), YELLOW(2000);
    private int delay;
    TrafficLightColor(int s) {delay = s;}
    int getDelay() {return delay;}}
//Имитация автоматизированного светофора
public class TrafficLightSimulator implements Runnable{
    public TrafficLightColor tic;//текущий цвет светофора
    boolean stop = false;//для остановки иммитации установить в true
    int counter = 11;
    boolean changed = false;//true, если светофор переключился
    TrafficLightSimulator(TrafficLightColor init) {
        tic = init;
    }
    TrafficLightSimulator() {tic = TrafficLightColor.RED;}
    //запуск иммитации автоматизированного светофора
    public void run(){
        while (!stop){
            try {
                switch (tic){
                    case GREEN:
                        Thread.sleep(TrafficLightColor.GREEN.getDelay());//зеленый на 10 секунд
                        break;
                    case YELLOW:
                        Thread.sleep(TrafficLightColor.YELLOW.getDelay());//желтый на 2 секунды
                        break;
                    case RED:
                        Thread.sleep(TrafficLightColor.RED.getDelay());//красный на 12 секунды
                        break;
                }
            }catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }
    //переключатель цвета светофора
    synchronized void changeColor(){
        switch (tic){
            case RED:
                tic = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tic = TrafficLightColor.RED;
                break;
            case GREEN:
                tic = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify();//уведомить о переключении цвета светофора
    }
    //ожидание переключения цвета светофора
    synchronized void waitForChange(){
        try{
            while(!changed)
                wait(); //ожидать переключение цвета светофора
            changed = false;
        } catch(InterruptedException e){
            System.out.println(e);
        }
    }
    synchronized void timer(TrafficLightColor col) throws InterruptedException {
        int sec = col.getDelay()/1000;
        while (sec != 0){
            System.out.println(sec);
            sec--;
            wait(1000);
            counter++;
            if (counter == 24){
                System.out.println("YELLOW \nмигает");
                wait(1000);
//                changed = true;
                counter = 0;
                tic = TrafficLightColor.GREEN;
                changed = true;
                break;
            }
        }
    }

    //Возврат текущего цвета
    synchronized TrafficLightColor getColor(){
        return tic;
    }
    //Прекращение имитации светофора
    synchronized void cancel(){
        stop = true;
    }
}
