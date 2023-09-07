public class TestClass2 extends TestClass{


    static int b;

    static {
        System.out.println("static TestClass2");
        b = 10;
        showMessage("123");
    }

    TestClass2() {
        super(a);
        System.out.println("constr TestClass2 c  = "+c);
    }
    TestClass2(int a) {
        super(1);
        System.out.println("constr TestClass2 c  = "+c);
    }
    public void myMethod() {
        System.out.println("wow1!");
    }

}
