package Lab22.Num6;

public class Num6_1 {

    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w = new Gen<A>(a);
        Gen<B> w1 = new Gen<B>(b);
        Gen<C> w2 = new Gen<C>(c);
        Gen<D> w3 = new Gen<D>(d);

        test(w);
        test(w1);
        test(w2);
        test(w3);
    }

    static void test(Gen<? extends A> o) {
        System.out.println("11");
    }
}
