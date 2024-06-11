package gr.aueb.cf.ch3.set1;

public class QueueManager {
    private static final QueueManager INSTANCE = new QueueManager();
    private static final String[] queue = new String[100];
    private static int pivot = -1;
    private static int front = 0;
    private QueueManager() {

    }

    public static QueueManager getQueue() {
        return INSTANCE;
    }

    public void enqueue(String str) throws Exception {
        try {
            if (isFull()) throw new Exception("The stack is full");

            pivot++;
            queue[pivot] = str;
            // Logging
//            System.out.println("The string was successfully enqueued.");
        } catch (Exception e) {
            // Logging
//            e.printStackTrace();
//            System.err.println(e.getMessage());
            throw e;
        }
    }

    public String dequeue() throws Exception {
        try {
            if (isEmpty()) throw new Exception("The stack is empty");

            String stringToReturn = queue[0];
            shiftQueueLeft();
            pivot--;
            // Logging
//            System.out.println("The string was successfully dequeued");
            return stringToReturn;
        } catch (Exception e) {
            // Logging
//            e.printStackTrace();
//            System.err.println(e.getMessage());
            throw e;
        }
    }

    public void showQueue() {
        for(int i = 0; i <= pivot; i++) {
            System.out.println(queue[i]);
        }
    }

    private boolean isEmpty() {
        return pivot == -1;
    }

    private boolean isFull() {
        return pivot == 99;
    }

    private void shiftQueueLeft() {
        for (int i = 0; i < pivot; i++) {
            queue[i] = queue[i + 1];
        }
    }

}


















