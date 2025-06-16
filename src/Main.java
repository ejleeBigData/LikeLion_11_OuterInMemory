class Outer {
    static class StaticInner {
        void hello() {
            System.out.println("hi!");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Outer.StaticInner inner = new Outer.StaticInner();
        inner.hello();
    }
}