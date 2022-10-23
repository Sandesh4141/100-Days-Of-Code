import java.util.ArrayList;
import java.util.LinkedList;

class Linked_List {
    public static void printList(LinkedList<Integer> list) {
        System.out.println("*** Printing Linked List *** ");
        System.out.print("[ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
            // System.out.print(", ");
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        // adding list elements
        linkedList.add(50);
        System.out.println(linkedList.get(0));
        linkedList.addFirst(40); // not in arraylist
        linkedList.addLast(100); // not in arraylist

        printList(linkedList);
        // adding some other elements at linked list
        linkedList.addFirst(30);
        linkedList.addFirst(20);
        linkedList.addFirst(10);
        printList(linkedList);
        linkedList.removeLast(); //

        printList(linkedList);
        linkedList.add(60);
        linkedList.addLast(70);
        linkedList.add(80);

        printList(linkedList);

        // another list having 90 100
        LinkedList<Integer> secondLinkedList = new LinkedList<>();
        secondLinkedList.add(90);
        secondLinkedList.add(100);
        printList(secondLinkedList);
        printList(linkedList);
        // merging both list
        linkedList.addAll(secondLinkedList); // added 90 and 100 to the linke list
        printList(linkedList);

        //trying to add arry list to linked list
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(110);
        arrList.add(120);
        arrList.add(130);
        arrList.add(140);
        arrList.add(150);
    
        secondLinkedList.addAll(arrList);
        printList(secondLinkedList);
        // and it works 
        
}
}