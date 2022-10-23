import java.util.ArrayDeque;

public class Deques {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrDq = new ArrayDeque<>();
        System.out.println(arrDq.isEmpty());
        // both methods below works same
        arrDq.add(50);
        arrDq.offer(60);

        arrDq.addLast(100);
        arrDq.offerLast(110);

        arrDq.removeFirst();
        arrDq.addFirst(10);
        arrDq.pollFirst();

        System.out.println(arrDq.peek());
        System.out.println(arrDq.element());

        arrDq.poll();
        arrDq.pollFirst();
        arrDq.pollLast();
        
    }
}
