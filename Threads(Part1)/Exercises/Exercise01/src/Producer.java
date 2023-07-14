public class Producer implements Runnable {

    @Override
    public void run() {

        Thread t = Thread.currentThread();
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println(t + " Producing... ");
                    Thread.sleep(1000);

                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println(t + ": exiting");
    }
}
