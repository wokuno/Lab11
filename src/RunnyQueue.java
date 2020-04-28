/*
    Meghana Woodruff    wood143
    William Okuno       Okuno006
    lab 11
*/
public class RunnyQueue<T> {
    private int tail;
    private RunnyQueueNode<T> head, next;

    public RunnyQueue(){
        this.head = new RunnyQueueNode<>(null, null);
        this.tail = 0;
        this.next = this.head;
    }

    public void enqueue(T elem) {
        if (isEmpty()) {
            this.head = new RunnyQueueNode<>(elem, null);
            this.next = this.head;

        } else {
            if (this.next.getData() == elem){
                this.next.setCount(this.next.getCount() + 1);
            }else{
                if (this.head == this.next){
                    this.next = new RunnyQueueNode<>(elem, null);;
                    this.head.setNext(next);
                }else{
                    RunnyQueueNode<T> temp = new RunnyQueueNode<>(elem, null);
                    this.next.setNext(temp);
                    this.next = temp;
                }
            }
        }
        tail++;
    }

    public T front(){
        if (this.head != null){
            return this.head.getData();
        }
        return null;
    }


    public T dequeue() {
        if (isEmpty()){
            return null;
        }
        if (tail != 0){
            tail--;
        }
        if (this.head.getCount() > 1){
            this.head.setCount(this.head.getCount() - 1);
            return this.head.getData();
        }else{
            RunnyQueueNode<T> temp = this.head;
            this.head = this.head.getNext();
            return temp.getData();
        }
    }

    public int frontRunLength(){
        if (isEmpty()){
            return 0;
        }
        return this.head.getCount();
    }

    public int getSize(){
        return tail;
    }

    public  boolean isEmpty(){

        if (this.head == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String tempS = "";
        RunnyQueueNode<T> temp = this.head;
        if (temp == null){
            return tempS;
        }
        while (temp != null){
            tempS += temp.toString() ;
            if (temp.getNext() != null){
                tempS += ", ";
            }
            temp = temp.getNext();
        }
        return tempS;
    }
}
