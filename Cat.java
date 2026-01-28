public class Cat implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                int value = Blackboard.getInstance().pop();
                System.out.println("Popped: " + value);
                Thread.sleep(1000);
            } catch (Exception e) {
        
            }
        }
    }
}



