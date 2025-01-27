package Lab22.Num9;

public class Num9_2 {
    public static void main(String[] args) {
//        Integer x[] = {1, 2, 3};
//        Num9_1<Integer> Ob1 = new Num9_1<Integer>(x);
        Number x[] = {1, 2, 3};
        Num9_1<Number> Ob1 = new Num9_1<Number>(x);
        if(Ob1.contains(2))
            System.out.println("2 содержится в Ob1");
        else
            System.out.println("2 не содержится в Ob1");
        if(Ob1.contains(5))
            System.out.println("5 содержится в Ob1");
        else
            System.out.println("5 не содержится в Ob1");
        if(!Ob1.contains(9.25))
            System.out.println("9,25 не содержится в Ob1");
    }
}
