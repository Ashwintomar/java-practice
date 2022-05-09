package arraylist;

import java.util.*;

public class arraylist {

    public static void main(String[] args) {

        List<String> arr = new ArrayList<String>();

        arr.add("Ashwin");
        arr.add("Tomar");
        arr.add("20BCS6180");
        arr.add("lmn");
        arr.add("opq");
        arr.add("rst");
        arr.remove("abc");
        Iterator it = arr.iterator();

        System.out.println("\nArraylist 1 elements : \n");
        while (it.hasNext()) {
            System.out.println(it.next()); // Printing the arraylist element
        }

        System.out.println("\n");
        System.out.println("Arraylist element indexes : \n");
        Iterator it1 = arr.iterator();
        while (it1.hasNext()) {
            String a = (String) it1.next();
            System.out.println("The index : " + arr.indexOf(a) + " The element is : " + a);

            // int x= arr.indexOf(a);
            // System.out.println("The index : " + x + " The element is : "+ get(x));
        }

        System.out.println("\n");
        List arr2 = new ArrayList(arr);

        System.out.println("\nArraylist 2 values : ");

        Iterator it2 = arr2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next()); // Printing the arraylist element
        }
        System.out.println("\nEquality check for arraylist1 and arraylist2 : ");
        System.out.println("\nArray 2 and Array 1 are equal : " + arr2.equals(arr));

        System.out.println("\nSearching to check if element exists in arraylist : ");

        System.out.println("\nArray contains Ashwin : " + arr.contains("Ashwin"));
        System.out.println("\n");
        System.out.println("\nSorting the arraylist : ");

        Collections.sort(arr2);
        System.out.print(arr2);

    }

}
