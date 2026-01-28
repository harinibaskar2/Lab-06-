
// Group Members: Harini Baskar and Giselle Ibarra

public class Person implements Runnable {
    private int counter = 0;
    
    @Override
    public void run() {
        while(true) {
                Blackboard.getInstance().push(counter);
                System.out.println("Pushed: " + counter);
                counter++;
                try {
                    Thread.sleep(1000);
                } catch (Exception e){
                    
                }
        }
    }
}

