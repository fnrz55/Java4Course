package Lab21.Num2;

enum TrafficLightColor {
    RED(12000, "�������"), YELLOW(2000, "������"), GREEN(10000, "�������"), YELLOW_GREEN(5000, "������");
    private int delay;
    private String name;
    TrafficLightColor(int s, String n) {
        delay = s;
        name = n;
    }

    String getName(){
        return name;
    }

    int getDelay() {
        return delay;
    }
}
