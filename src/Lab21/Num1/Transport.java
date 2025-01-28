package Lab21.Num1;

public enum Transport {
    CAR(3, "Автомобиль переозит людей"),
    TRACK(5, "Грузовики предназначены для перевозки грузов . В них путешествовать некомфортно, но если " +
            "зажмуриться, то можно. Но, к сожалению, наша компания таких услуг не предоставляет. Рекомендуем вам " +
            "обратить внимание на другой вид транспорта"),
    PLANE(4, "Самолет летит"),
    TRAIN(3, "Поезд движется по рельсам"),
    BOAT(6, "Лодка плывет по воде");
    private int cost;
    private String message;

    Transport(int c, String mess){
        cost = c;
        message = mess;
    }

    public String getMessage(){
        return message;
    }

    public int getCost(){
        return cost;
    }
}
