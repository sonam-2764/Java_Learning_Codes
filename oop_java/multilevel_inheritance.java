package oop_java;

class A {
    void methodA() {
        System.out.println("method of class A");
    }
}

class B extends A {
    void methodB() {
        System.out.println("method of class B");
        // B can't access methods of c
    }
}

class C extends B {
    void methodC() {
        System.out.println("method of class C");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
