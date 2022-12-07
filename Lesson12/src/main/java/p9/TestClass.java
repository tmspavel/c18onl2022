package p9;


public class TestClass {
    public static void main(String[] args) {
        TestClass a = new TestClass();
        System.out.println("result of a.a() is " + a.a());
        a = null;
        System.gc(); // Принудительно зовём сборщик мусора
        a = new TestClass();
        System.out.println("result of a.a() is " + a.a());
        System.out.println("!!! done");
    }

    public int a() {
        try {
            System.out.println("!!! a() called");
//            for (int i = 0; i < 1000000; i++) {
//                sleep(1000);
//            }
            throw new Exception("");
        } catch (Exception e) {
            System.out.println("!!! Exception in a()");
            return 2;
        } finally {
            System.out.println("!!! finally in a() ");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("!!! finalize() called");
        super.finalize();
    }
}
