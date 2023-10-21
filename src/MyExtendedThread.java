public class MyExtendedThread extends Thread{

    @Override
    public void run() {

        System.out.println("MyExtendedThread "+getName()+" started.");

        for (int i = 0; i < 10; i++) {

            System.out.println(getName() +", i = "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
