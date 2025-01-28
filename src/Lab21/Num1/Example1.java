package Lab21.Num1;
import java.io.DataInputStream;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        DataInputStream dis = new DataInputStream(System.in);
        Transport tp = Transport.CAR;
        boolean track = false;
        boolean flag = true;
        int cost = 0;
        Transport[] transportArray = Transport.values();
        try {
            while (flag) {
                int trNum = 0;
                try {
                    System.out.println("�������� ��� ����������:\n1 - ������\n2 - ��������\n3 - �������\n4 - �����\n5 - �����\n-1 - ����� �� ���������");
                    trNum = dis.readInt();
                    try {
                        tp = transportArray[trNum - 1];
                        System.out.println(tp.getMessage());
                        if (tp != Transport.TRACK) {
                            track = true;
                        }
                        flag = false;
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("������� ������������ ��������, �������� �� ������������ ���������");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("������� ������������ ��������");
                }
            }
            if(track){
                flag = true;
                System.out.println("������� �� �� ��������� ��������� ������� ? 1 - ��, -1 -  ���");
                while (flag){
                    int ans = 0;
                    try{
                        ans = dis.readInt();
                        if (ans == 1){
                            System.out.println("������� ����������: ");
                            int km = dis.readInt();
                            System.out.println("��������� �������: " + tp.getCost() * km);
                        }
                        flag = false;
                    }catch (NumberFormatException e){
                        System.out.println("������� ������������ ��������");
                    }
                }
            }
        }catch (Exception e){
            System.out.println("������ " + e.getMessage());
        }

    }
}
