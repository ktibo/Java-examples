public class TestClass implements MyInterface {

    private final String[] str;
    static int c = 20;

    private int counter;

    {
        System.out.println("TestClass");
    }

    public static void staticMethod(){
        String threadName = Thread.currentThread().getName();
        System.out.println("staticMethod() thread: "+ threadName);
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("counter: "+counter++);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    synchronized public static void staticMethod2(){
        System.out.println("staticMethod2() thread: "+Thread.currentThread().getName());
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("counter2: "+counter++);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    TestClass() {
        str = new String[1];
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
//    public static void main(String[] args) {
//        int a = 4;
//    }

    public static void showMessage(String msg) {
        //System.out.println(msg);
    }

    public String[] getStr() {
        return str.clone();
    }

    @Override
     synchronized public void mySynchronizedMethod(String threadName) {
        System.out.println("mySynchronizedMethod() thread: "+threadName);
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("counter: "+counter++);
            try {
                notify();
                if (i == 5 && threadName.equals("my1")) wait(); // test
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
