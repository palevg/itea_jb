package itea.lsn9;

public class Interfaces {

    public static void main(String[] args) {
        A o = new B();
        o.m();
    }
}

class A {
    protected void m() {
        System.out.println("A");
    }
}

class B extends A implements I {
    @Override
    public void m() {
        System.out.println("B");
    }
    public void m1() {
        m();
    }
}

interface I {
    void m();
}