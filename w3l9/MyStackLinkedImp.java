package w1l2.CS390_Assignments.w3l9;


public class MyStackLinkedImp  {
   Node head;
   int size;

    public class Node{
    private Node next ;
    private Object data;

    public Node(Node next, Object data){
        this.next= next;
        this.data=data;
    }

}

    public void push(Object ob) {
        Node node= new Node(head,ob);
          head= node;
        //node=ob;
        //return ob;
        size++;
    }

    public Object pop() {
        if (isEmpty())
            return null;
        else {
            Node hand = head;
            head = head.next;
            size--;
            return hand.data;
        }
    }

    public Object peek() {
    if (isEmpty()) {
        return null;
    }
    else{
        return head.data;
    }
    }

    public boolean isEmpty() {

        return head == null ;
    }

    public int size() {
        return size;
    }
    public static void main(String[] args) {
       MyStackLinkedImp stk = new MyStackLinkedImp(); // create stack of size 4
        Object item;
        stk.push('A'); // push 3 items onto stack
        stk.push('B');
        stk.push('C');
        stk.push('D');

        System.out.println("size(): " + stk.size());
        item = stk.pop(); // delete item
        System.out.println(item + " is deleted");
        stk.push('D'); // add three more items to the stack
        stk.push('E');
        System.out.println(stk.pop() + " is deleted");
        stk.push('G'); // push one item
        item = stk.peek(); // get top item from the stack
        System.out.println(item + " is on top of stack");
        System.out.println("Size of the Stack : " + stk.size());
            /*    MyStackImp stk1 = new MyStackImp(4);
        stk1.push("Java");
        stk1.push(20);
        stk1.push(30);*/

    }
}
