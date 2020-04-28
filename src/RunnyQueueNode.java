/*
    Meghana Woodruff    wood143
    William Okuno       Okuno006
    lab 11
*/
public class RunnyQueueNode<T> {

    private T data;
    private int count;
    private RunnyQueueNode<T> next = null;

    public RunnyQueueNode(T data, RunnyQueueNode<T> next){
        this.count = 1;
        this.data = data;
        this.next = next;
    }

    public T getData(){
        return this.data;
    }
    public int getCount(){
        return this.count;
    }
    public RunnyQueueNode<T> getNext(){
        return this.next;
    }
    public void setData(T data){
        this.data = data;
    }

    public void setCount(int count){
        this.count = count;
    }
    public void setNext(RunnyQueueNode<T> next){
        this.next = next;
    }

    @Override
    public String toString() {
        return this.data.toString() + ":" + this.count;
    }
}
