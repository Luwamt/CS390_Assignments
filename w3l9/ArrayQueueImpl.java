package w1l2.CS390_Assignments.w3l9;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayQueueImpl {
    private  int front;
    private int rear;
    private int[] arr;
    //int size;
    public ArrayQueueImpl() {
        this.front = -1;
        this.rear = 0;
        arr = new int[10];
        //size=0;
    }
    public int peek() {
        if(isEmpty()){
            return -1;
        }else
            return  arr[front];

    }
    public void enqueue(int obj){
        if (rear==arr.length) {
            resize();
        }
        if ((isEmpty()))
            front++;
       
           arr[rear++] = obj;
     
    }
    public int dequeue() {
        if (isEmpty())
        return -1;
        int item = arr[front];
        front++;
            return item;
        }

    public boolean isEmpty(){
                     //implement
        return ( front==-1|| front==rear);
    }
    public int size(){

        return (rear-front);
    }
    private void resize(){
    	
        int newLen= 2*arr.length;
        arr = Arrays.copyOf(arr,newLen);

    }
    public  void print(){
    	int len= size();
    	for(int i=front ;i< rear; i++ ) {
    		System.out.print(arr[i] +" ");
        }
    	System.out.println( "\n++++++++++++++++++");
		/*
		 * for(int i=front;i<len + front; i++ ) { System.out.print(arr[i] +" "); }
		 */
    }

    public static void main(String[] args) {
      ArrayQueueImpl h= new ArrayQueueImpl();
        h.enqueue(10);
        h.enqueue(20);
        h.enqueue(30);
        h.print();
       
        System.out.println("Peeking the top element: "+h.peek());
        System.out.println("Delete the element: "+h.dequeue());
        System.out.println("Peeking the second element: "+h.peek());
        //System.out.println(h.peek());
        h.print();
       
        System.out.println("The size of the arr: "+h.size());
    }
}
