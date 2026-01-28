// Group Members: Harini Baskar and Giselle Ibarra

public class Home {
    public static void main(String[] args) throws InterruptedException {

    
        int numPersons = 10; 
        int numCats = 10;  
       


        for (int i = 1; i <= numPersons; i++) {
            new Thread(new Person()).start();
        }

        for (int i = 1; i <= numCats; i++) {
            new Thread(new Cat()).start();
        }


        Thread.sleep(10000);

        System.out.println("Final stack contents:");
        System.out.println(Blackboard.getInstance().getStack());

        System.exit(0);
    }
}

