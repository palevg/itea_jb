package itea.lsn6.Wrk;

/**
 * Created by ITEA on 09.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        A b1 = new B();
        B b2 = new B();
        b1.test(b1);
    }
}
abstract class A  {
    void test(A a) {
        System.out.println("You are in A");
    }
}
class B extends A {
    void test(B b) {
        System.out.println("You are in B");
    }
}