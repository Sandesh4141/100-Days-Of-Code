import java.util.Vector;

public class Vectors {
    public static void printVector(Vector<Integer> vec) {
        System.out.println("*** Printing Vector Elements *** ");
        System.out.print("[ ");
        for (int i = 0; i < vec.size(); i++) {
            System.out.print(vec.get(i) + ", ");
        }
        System.out.println("] ");
    }

    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.add(43);
        System.out.println(vec.get(0));
        System.out.println("Size of Vector : " + vec.size());
        vec.insertElementAt(64, 1);
        printVector(vec);
        vec.add(565);
        vec.set(0, 5);
        printVector(vec);
        // System.out.println("Size of Vector : " + vec.size());
    }
}
