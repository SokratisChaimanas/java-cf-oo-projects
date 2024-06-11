package gr.aueb.cf.ch3.set1;

public class StackManagerMain {

    public static void main(String[] args) throws Exception {
        StackManager stackManager = StackManager.getStackManager();

        try {
            String s2 = stackManager.pop();
        } catch (Exception e) {
            System.out.println("The stack is empty");
        }
        try {
            stackManager.push("Hello");
            stackManager.push("World");
        } catch (Exception e) {
            System.out.println("The stack is full");
        }
        stackManager.showStack();
        try {
            String s1 = stackManager.pop();
        } catch (Exception e) {
            System.out.println("The stack is empty");
        }

        System.out.println();
        stackManager.showStack();
    }
}
