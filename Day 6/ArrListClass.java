import java.util.*;

class ArrListClass {
    public static void printArr(ArrayList<Integer> numbIntegers) {
        System.out.println("*** Printing Number Arraylist ***");
        System.out.print("[");
        for (int i = 0; i < numbIntegers.size(); i++) {
            System.out.print(numbIntegers.get(i));
            System.out.print(",");
        }
        System.out.print("]\n");
    }

    public static void cPrintArr(ArrayList<Character> charList) {
        System.out.println("*** Printing Character Array List *** ");
        System.out.print("[");
        for (int i = 0; i < charList.size(); i++) {
            System.out.print(charList.get(i));
            System.out.print(" ,");
        }
        System.out.println("]");
    }

    public static void sPrintArr(ArrayList<String> strList) {
        System.out.println("*** Priting String Array List ***");
        System.out.print("[");
        for (int i = 0; i < strList.size(); i++) {
            System.out.print(strList.get(i));
            System.out.print(" ,");
        }
        System.out.println("]");

    }

    public static void main(String[] args) {
        ArrayList<Integer> numbIntegers = new ArrayList<>();
        // size() -> used to get the size of the list.
        System.out.println("The size of numbIntegers: " + numbIntegers.size());
        // add()-> used to add (append) elements at last of the list
        numbIntegers.add(56);
        numbIntegers.add(652);
        for (int i = 0; i < numbIntegers.size(); i++) {
            System.out.print(numbIntegers.get(i));
            System.out.print(",");

        }

        System.out.println("\n" + "The size of numbIntegers: " + numbIntegers.size());
        // get() -> used to get the element(value) at specified index.

        System.out.println("Number at Index 1: " + numbIntegers.get(1));

        // addAll() ->
        System.out.println("Adding numbList list to numbIntegers list");
        ArrayList<Integer> numbList = new ArrayList<>(5);
        numbList.add(4);
        numbList.add(65);
        numbList.add(567);
        numbList.add(644);
        numbList.add(983);

        numbIntegers.addAll(numbList); // adding numbList list to numbIntegers
        System.out.println("The size of the numbIntegers after adding numbList to it: " + numbIntegers.size());

        System.out.println("Printing all array elements: ");
        for (int i = 0; i < numbIntegers.size(); i++) {
            System.out.print(numbIntegers.get(i));
            System.out.print(",");
        }
        System.out.println();

        // contains() -> contains if object is present in array list
        System.out.println("is contains 4:" + numbIntegers.contains(4));
        System.out.println("is contains 46:" + numbIntegers.contains(47));

        // set() ->
        System.out.println("Adding number to 1'th index.");
        numbIntegers.set(1, 7658);
        printArr(numbIntegers); // helper function to print array
        numbIntegers.remove(5);
        printArr(numbIntegers);
        numbIntegers.remove(2);
        printArr(numbIntegers);

        // character array list
        ArrayList<Character> charList = new ArrayList<>();
        System.out.println("The size of initial character array is: " + charList.size());
        // cPrintArr(charList);
        charList.add('a');
        charList.add('b');
        charList.add('c');
        charList.add('d');
        charList.add('e');
        cPrintArr(charList);
        charList.remove(3);
        cPrintArr(charList);
        System.out.println("The size of character array now is: " + charList.size());

        charList.set(3, 's'); // adding char at index 3
        cPrintArr(charList);

        // Array list of Strings

        ArrayList<String> strList = new ArrayList<>(10);
        strList.add("Sandesh");
        strList.add("Ajay");
        strList.add("Tony");
        strList.add("Max");
        sPrintArr(strList);

    }

}
