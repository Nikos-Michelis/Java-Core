public class Consumer implements Runnable {
    private Resource resource;
    int id;

    public Consumer(int id, Resource resource) {
        this.id = id;
        this.resource = resource;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        t.setName("Consumer" + id);

        try{
            while(true) {
                resource.remove();
            }
           
        }catch (InterruptedException e){                             
            System.out.println(t + "Interrupted: production finished");
        }
        System.out.println(t + " finished! ");
    }
}