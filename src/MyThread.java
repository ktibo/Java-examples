
public class MyThread implements Runnable {

    Thread thread;
    int counter = 0;

    public boolean isSuspended() {
        return suspended;
    }

    private boolean suspended;

    public MyThread() {
        thread = new Thread(this);
    }

    public MyThread(String name) {
        thread = new Thread(this, name);
    }

    public static MyThread createAndStart(String name) {

        MyThread myThread = new MyThread(name);
        myThread.thread.setUncaughtExceptionHandler(new MyHandler());
        myThread.thread.start();
        return myThread;

    }

    public static MyThread createAndStart(String name, int newPriority) {

        MyThread myThread = new MyThread(name);
        myThread.thread.setPriority(newPriority);
        myThread.thread.start();
        return myThread;

    }

    public static MyThread createAndStart(String name, Thread waitThread) {

        MyThread myThread = new MyThread(name);
        try {
            waitThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.thread.start();
        return myThread;

    }

    synchronized public void suspend() {
        System.out.println(thread.getName()+" is suspended");
        suspended = true;
    }

    synchronized public void continueThread() {
        System.out.println(thread.getName()+" is continued");
        suspended = false;
        ThreadsExamples.testClass.awake();
    }

    @Override
    public void run() {

        //String currentThread = "currentThread \""+Thread.currentThread().getName()+"\" (obj \""+name+"\")";
        String threadName = thread.getName();
        System.out.println(threadName + " started.");
        //throw  new RuntimeException("ops");
        ThreadsExamples.testClass.mySynchronizedMethod(this);
        //if (thread.getName().equals("my1")) {
        // TestClass.staticMethod();
        //} else {
        //TestClass.staticMethod2();
        //}
//        for (int i = 0; i < 10; i++) {
//
//            System.out.println(thread.getName() +", counter = "+counter++);
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

    }
}

class MyHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("MyHandler! Thread \""+t+"\" : "+e);
    }

}