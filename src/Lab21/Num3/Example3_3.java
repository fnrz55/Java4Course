package Lab21.Num3;

public class Example3_3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;
        iOb = 99;
        System.out.println("�������� �������� iOb: " + iOb);
        ++iOb;
        System.out.println("����� ++iOb: " + iOb);
        iOb += 10;
        System.out.println("����� iOb += 10: " + iOb);
        iOb2 = iOb + (iOb/3);
        System.out.println("iOb2 ����� ���������� ���������: " + iOb2);
        i = iOb + (iOb/3);
        System.out.println("i ����� ���������� ���������: " + i);
    }
}
