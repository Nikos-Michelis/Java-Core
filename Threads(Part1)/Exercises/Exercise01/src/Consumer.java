public class Consumer implements Runnable{
    @Override
    public void run() {

        Thread t = Thread.currentThread();
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.println(t + " Consuming... " );
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println(t + ": exiting");
    }
}
