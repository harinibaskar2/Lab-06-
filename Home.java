
public class Home {
    public static void main(String[] args) {

        

        Thread personThread = new Thread(new Person());
        Thread catThread = new Thread(new Cat());

        personThread.start();
        catThread.start();

        try {
            Thread.sleep(10000); // let threads run for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final stack contents:");
        System.out.println(Blackboard.getInstance().getStack());

        System.exit(0); 
}

} 
