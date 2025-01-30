package Lab22.Num2;

public class Num2_1 <T, V> {
    T ob1; V ob2;
    Num2_1(T o1, V o2){
        ob1 = o1; ob2 = o2;
    }
    void showTypes() {
        System.out.println("“ип T - это" + ob1.getClass().getName());
        System.out.println("“ип V - это" + ob2.getClass().getName());
    }
    T getob1(){ return  ob1;}
    V getob2() {return  ob2;}

}
