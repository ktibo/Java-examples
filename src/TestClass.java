public class TestClass implements MyInterface {
    private final String[] str;
    static int c = 20;

    {
        System.out.println("TestClass");
    }

    public static void main(String[] args) {
        int a = 4;
    }

    public static void showMessage(String msg){
        System.out.println(msg);

    }

    TestClass(int a) {
        System.out.println("constr TestClass");
        str = new String[1];
        str[0] = "123";
    }
    private TestClass(String a) {
        System.out.println("constr TestClass");
        str = new String[1];
        str[0] = "123";
    }
    public String[] getStr() {
        return str.clone();
    }

    @Override
    public void myMethod() {
        System.out.println("wow!");
    }
}
