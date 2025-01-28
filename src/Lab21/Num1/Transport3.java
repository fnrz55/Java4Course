package Lab21.Num1;

enum Transport3 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int avspeed;

    Transport3(int s) {
        avspeed = s;
    }

    int getAvspeed() {
        return avspeed;
    }
}
