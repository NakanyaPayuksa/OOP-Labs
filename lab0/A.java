public class A {
public void print() {
System.out.println(“Print A”);
}
}

public class B extends A {
@Override
public void print() {
System.out.println(“Print B”);
}
}

public class C extends A {
@Override
public void print() {
System.out.println(“Print C”);
}
}

public class D extends B {
    public void setter(int x) {
    }
}

public class Test {
    public static void main(String[] args) {
        D d = new D();
        d.print();
    }
}