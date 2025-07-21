//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.deQueue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.deQueue();
        queue.deQueue();
        queue.enqueue(24);
        queue.deQueue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}