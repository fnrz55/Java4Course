package Lab21.Num1;

public enum Transport {
    CAR(3, "���������� �������� �����"),
    TRACK(5, "��������� ������������� ��� ��������� ������ . � ��� �������������� �����������, �� ���� " +
            "�����������, �� �����. ��, � ���������, ���� �������� ����� ����� �� �������������. ����������� ��� " +
            "�������� �������� �� ������ ��� ����������"),
    PLANE(4, "������� �����"),
    TRAIN(3, "����� �������� �� �������"),
    BOAT(6, "����� ������ �� ����");
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
