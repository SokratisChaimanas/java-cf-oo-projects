package gr.aueb.cf.ch3.set1;

public class QueueManagerMain {

    public static void main(String[] args) {
        QueueManager queue = QueueManager.getQueue();

        try {
            queue.enqueue("This will get dequeued!");
            queue.enqueue("Hello World");
            String s = queue.dequeue();
        } catch (Exception e) {
            System.out.println("Could not process the queue");
        }



        queue.showQueue();
    }
}
