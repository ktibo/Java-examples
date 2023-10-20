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
            }

        }

    }

    private static void createNewThread() throws InterruptedException {
        System.out.println("createNewThread() start");
        MyThread my = new MyThread("thread1");
        java.lang.Thread thread = new java.lang.Thread(my);
        java.lang.Thread thread1 = new java.lang.Thread(my);
        thread.start();
        thread1.start();
        System.out.println("Waiting 1 sec...");
        java.lang.Thread.sleep(1000);
        System.out.println("createNewThread() end");
    }

}
