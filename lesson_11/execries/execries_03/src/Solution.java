public class Solution {
    Queue queue = new Queue();

    public void enQueue(int value) {
        Node temp = new Node(value);

        if (queue.rear == null) {
            queue.front = queue.rear = temp;
            return;
        }

        queue.rear.link = temp;
        queue.rear = temp;
    }

        public void deQueue(){
            if(queue.front == null) {
                System.out.println("Hang doi rong, khong the xoa.");
                return;
            }
            queue.front = queue.front.link;
            if(queue.front == null)
                queue.rear = null;
        }

        public void displayQueue(){
            if(queue.rear == null) {
                System.out.println("Hang doi rong.");
                return;
            }

            Node temp = queue.front;
            System.out.print("Cac phan tu trong hang doi: ");
            while(temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.link;
            }
            System.out.println();
        }
}
