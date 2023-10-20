
public class MyThread implements Runnable {

    private final String name;
    int counter = 0;

    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run() {

        String currentThread = "currentThread \""+Thread.currentThread().getName()+"\" (obj \""+name+"\")";
        System.out.println(currentThread+" started.");

        for (int i = 0; i < 10; i++) {

            System.out.println(currentThread +" , counter = "+counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
