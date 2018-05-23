import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class a_11_2 {

    /*
    2. Write a method called alternate that accepts two Lists as its parameters and returns a new List containing alternating
    elements from the two lists, in the following order:
            • First element from first list
            • First element from second list
            • Second element from first list
            • Second element from second list
            • Third element from first list
            • Third element from second list
            • . . .
    If the lists do not contain the same number of elements, the remaining elements from the longer list should be
    placed consecutively at the end. For example, for a first list of [1, 2, 3, 4, 5] and a second list of [6, 7, 8,
            9, 10, 11, 12], a call of alternate(list1, list2) should return a list containing [1, 6, 2, 7, 3, 8,
            4, 9, 5, 10, 11, 12].
    */

    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        list1.add(0, 1);
        list1.add(1, 2);
        list1.add(2, 3);
        list1.add(3, 4);
        list1.add(4, 5);

        list2.add(0, 6);
        list2.add(1, 7);
        list2.add(2, 8);
        list2.add(3, 9);
        list2.add(4, 10);
        list2.add(5, 11);
        list2.add(6, 12);


        System.out.println("1st list: " + list1);
        System.out.println("2nd list: " + list2);
        System.out.println();
        System.out.println("Expected result: \n[1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12]");
        System.out.println("Result from alternate(list1, list2): \n" + alternate(list1, list2));

    }

    public static List<Integer> alternate(List<Integer> foo, List<Integer> bar) {

        List<Integer> listToReturn = new LinkedList<>();
        ListIterator<Integer> iterFoo = foo.listIterator();
        ListIterator<Integer> iterBar = bar.listIterator();

        while (iterFoo.hasNext() || iterBar.hasNext()) {

            if (iterFoo.hasNext()) {

                listToReturn.add(iterFoo.next());
            }

            if (iterBar.hasNext()) {

                listToReturn.add(iterBar.next());
            }
        }

        return listToReturn;
    }
}
