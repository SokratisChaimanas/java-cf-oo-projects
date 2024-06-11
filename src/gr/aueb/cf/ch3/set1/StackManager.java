package gr.aueb.cf.ch3.set1;
/**
 * It applies LIFO logic into an array of man 100 strings.
 */

public class StackManager {
    private static final StackManager INSTANCE = new StackManager();
    private static int top = -1;
    private static final String[] stack = new String[100];

    private StackManager() {

    }

    public static StackManager getStackManager() {
        return INSTANCE;
    }

    /**
     * Inserts an element to the end of the stack
     *
     * @param str
     *      the element to get inserted
     * @throws Exception
     *      if the array is full.
     */
    public void push(String str) throws Exception {
        try {
            if (isFull()) throw new Exception("The stack is full");
            top++;
            stack[top] = str;
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }

    }

    /**
     * Returns to the user the last pushed element and "removes" it
     * from the string array.
     *
     * @return
     *      the last pushed string
     * @throws Exception
     *      if the array is already empty.
     */
    public String pop() throws Exception {
        try {
            if (isEmpty()) throw new Exception("The stack is empty.");
            String stringToReturn = stack[top];
            top--;
            return stringToReturn;
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

    public void showStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    /**
     * Checks if the array is empty
     *
     * @return
     *      true if empty, false otherwise
     */
    private boolean isEmpty() {
        return top == -1;
    }

    /**
     * Checks if the array is full
     *
     * @return
     *      true if full, false otherwise.
     */
    private boolean isFull() {
        return top == 99;
    }
}
