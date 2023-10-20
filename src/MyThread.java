
public class MyThread implements Runnable {

    Thread thread;
    int counter = 0;
    public MyThread(){
        thread = new Thread(this);
    }
    public MyThread(String name){
        thread = new Thread(this, name);
    }

    public static MyThread createAndStart(String name){

        MyThread myThread = new MyThread(name);
        myThread.thread.start();
        return myThread;

    }
    @Override
    public void run() {

        //String currentThread = "currentThread \""+Thread.currentThread().getName()+"\" (obj \""+name+"\")";
        System.out.println(thread.getName()+" started.");

        for (int i = 0; i < 10; i++) {

            System.out.println(thread.getName() +", counter = "+counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
