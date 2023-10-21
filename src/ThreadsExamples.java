import java.io.*;

public class ThreadsExamples {

    public static void main(String[] args) throws Exception {

        while (true) {


            String strMenu = "\nChoose the option:\n";
            strMenu += "1 - new thread\n";
            strMenu += "0 - quit!";

            System.out.println(strMenu);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();

            switch (str) {
                case "0":
                    return;
                case "1":
                    createNewThread();
                    break;
                default:
                    System.out.println("Didn't recognize an option \"" + str + "\". Try again.");
            }break;

        }

    }

    private static void createNewThread() throws InterruptedException {
        System.out.println("createNewThread() start");
       // MyThread my = new MyThread("thread1");
        //Thread thread = new Thread(my, "thread");
        //Thread thread1 = new Thread(my);
       // thread.start();
        //thread1.start();

        //System.out.println("Waiting 1 sec...");
        //Thread.sleep(1000);
        MyThread my1 =MyThread.createAndStart("MAX_PRIORITY", Thread.MAX_PRIORITY);
        MyThread my2=MyThread.createAndStart("MIN_PRIORITY", Thread.MIN_PRIORITY);

        //MyExtendedThread myExt = new MyExtendedThread();
        //myExt.start();
        //Thread.sleep(1000);

        //MyThread my1 =MyThread.createAndStart("my test thread", myExt);

        System.out.println("createNewThread() end");
    }

}
