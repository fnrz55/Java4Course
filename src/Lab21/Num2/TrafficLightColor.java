package Lab21.Num2;

enum TrafficLightColor {
    RED(12000, "Красный"), YELLOW(2000, "Желтый"), GREEN(10000, "Зеленый"), YELLOW_GREEN(5000, "Желтый");
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
