package Lab21.Num2;
import java.util.Timer;
enum TrafficLightColor{RED(12000), GREEN(10000), YELLOW(2000);
    private int delay;
    TrafficLightColor(int s) {delay = s;}
    int getDelay() {return delay;}}
//�������� ������������������� ���������
public class TrafficLightSimulator implements Runnable{
    public TrafficLightColor tic;//������� ���� ���������
    boolean stop = false;//��� ��������� ��������� ���������� � true
    int counter = 11;
    boolean changed = false;//true, ���� �������� ������������
    TrafficLightSimulator(TrafficLightColor init) {
        tic = init;
    }
    TrafficLightSimulator() {tic = TrafficLightColor.RED;}
    //������ ��������� ������������������� ���������
    public void run(){
        while (!stop){
            try {
                switch (tic){
                    case GREEN:
                        Thread.sleep(TrafficLightColor.GREEN.getDelay());//������� �� 10 ������
                        break;
                    case YELLOW:
                        Thread.sleep(TrafficLightColor.YELLOW.getDelay());//������ �� 2 �������
                        break;
                    case RED:
                        Thread.sleep(TrafficLightColor.RED.getDelay());//������� �� 12 �������
                        break;
                }
            }catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }
    //������������� ����� ���������
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
        notify();//��������� � ������������ ����� ���������
    }
    //�������� ������������ ����� ���������
    synchronized void waitForChange(){
        try{
            while(!changed)
                wait(); //������� ������������ ����� ���������
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
                System.out.println("YELLOW \n������");
                wait(1000);
//                changed = true;
                counter = 0;
                tic = TrafficLightColor.GREEN;
                changed = true;
                break;
            }
        }
    }

    //������� �������� �����
    synchronized TrafficLightColor getColor(){
        return tic;
    }
    //����������� �������� ���������
    synchronized void cancel(){
        stop = true;
    }
}
