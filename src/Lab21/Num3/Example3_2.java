package Lab21.Num3;

public class Example3_2 {
    static void m (Integer v){
        System.out.println("m() ������� " + v);
    }
    static int m2(){
        return 10;
    }
    static Integer m3(){
        return 99;
    }
    public static void main(String[] args) {
        Integer iOb = m2();
        System.out.println("��������, ������������ �� m2(): " + iOb);
        int i = m3();
        System.out.println("��������, ������������ �� m3(): " + i);
        iOb = 100;
        System.out.println("������ ���������� �� iOb: " + Math.sqrt(iOb));
    }
}
