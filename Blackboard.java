import java.util.Vector;
public class Blackboard {
    private static Blackboard instance;
    private Vector<Integer> stack;

    private Blackboard() {
        stack = new Vector<>();
    }

    public static Blackboard getInstance() {
        if (instance == null)
            instance = new Blackboard();
        return instance;
    }

    // push functionality
    public void push(int item) {
        stack.add(item);
    }

    // pop 
    public Integer pop(){
        if (stack.size() == 0)
            return null;
        return stack.remove(stack.size() - 1);
    }


    public Vector<Integer> getStack () {
        return new Vector<>(stack);
    }
}
