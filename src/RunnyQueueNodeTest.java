public class RunnyQueueNodeTest {
    public static void main(String[] args) {
        RunnyQueueNode<String> rqn = new RunnyQueueNode<>("apple", null);
        System.out.println(rqn.getData()); // apple
        System.out.println(rqn.getNext() == null); // true

        RunnyQueueNode<String> nodeTwo = new RunnyQueueNode<>("apple", null);
        rqn.setData("banana");
        rqn.setNext(nodeTwo);

        System.out.println(nodeTwo.getData()); // apple
        System.out.println(nodeTwo.getNext() == null); // true

        System.out.println(rqn.getData()); // banana
        System.out.println(rqn.getNext() == null); // false
        System.out.println(rqn.getNext() == nodeTwo); // true

        nodeTwo.setData("nameless");

        System.out.println(rqn.getNext().getData()); // nameless

        RunnyQueueNode<Integer> i = new RunnyQueueNode<>(1, null);
        System.out.println((13 + i.getData())); // 14
    }
}
/* Expected output:
apple
true
apple
true
banana
false
true
nameless
14
 */