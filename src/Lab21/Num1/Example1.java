package Lab21.Num1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Transport tp = Transport.CAR;
        boolean track = false;
        boolean flag = true;
        Transport[] transportArray = Transport.values();
        while (flag) {
            System.out.println("�������� ��� ����������:\n1 - ������\n2 - ��������\n3 - �������\n4 - �����\n5 - �����\n-1 - ����� �� ���������");
            String tr = br.readLine();
            try {
                int trNum = Integer.parseInt(tr);
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
        if (track) {
            flag = true;
            System.out.println("������� �� �� ��������� ��������� ������� ? y - ��, n -  ���");
            String ans = br.readLine();
            while (flag) {
                if (ans.equals("y")) {
                    System.out.println("������� ����������: ");
                    String km = br.readLine();
                    try {
                        int kmNum = Integer.parseInt(km);
                        System.out.println("��������� �������: " + tp.getCost() * kmNum);

                    } catch (NumberFormatException e) {
                        System.out.println("������� ������������ ��������");
                        continue;
                    }
                }
                flag = false;
            }
        }
    }
}
