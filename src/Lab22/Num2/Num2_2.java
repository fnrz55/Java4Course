package Lab22.Num2;

public class Num2_2 {
    public static void main(String args[]) {
        Num2_1<Integer, String> tgObj = new Num2_1<Integer, String>(88, "Обобщения");
        tgObj.showTypes();
        int v = tgObj.getob1();
        System.out.println("значение" + v);
        String str = tgObj.getob2();
        System.out.println("значение" + str);
    }
}
