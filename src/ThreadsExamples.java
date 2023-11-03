import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class ThreadsExamples {

    static TestClass testClass = new TestClass();

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
                    System.out.println("Invalid option \"" + str + "\". Try again.");
            }
            break;

        }

    }

    private static void createNewThread() throws InterruptedException {
        //System.out.println("createNewThread() start");

//        MyExtendedThread my0 = new MyExtendedThread();
//        my0.start();
//        MyExtendedThread my01 = new MyExtendedThread();
//        my01.start();
        //System.out.println("Waiting 1 sec...");
        //Thread.sleep(1000);

        MyThread my1 = MyThread.createAndStart("my1");
        //MyThread my2 = MyThread.createAndStart("my2");
        Thread.sleep(300);
        my1.suspend();
        //my1.thread.interrupt();
        Thread.sleep(2000);
        my1.continueThread();

        my1.thread.join();
        //my2.thread.join();

        //System.out.println("createNewThread() end");
    }

}
