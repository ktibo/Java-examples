public class MyExtendedThread extends Thread{

    @Override
    public void run() {

        System.out.println("MyExtendedThread "+getName()+" started");

    }
}
