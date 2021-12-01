package com.company;

/*
Create an ArrayList of type String with 10 string elements. Add 10 string elements to
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        //Create an ArrayList of type String with 10 string elements.
        ArrayList<String> arrayList = new ArrayList<>(10);
        Collections.addAll(arrayList, "A", "B", "C", "D", "E", "F", "G", "H", "I", "J");

        //Add an element to the ArrayList
        arrayList.add("K");

        //Iterate through the ArrayList by using Iterator object
        System.out.println("Elements in ArrayList:" );
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Add an element at a specific index
        arrayList.add(0, "A++");
        System.out.println("Elements in the ArrayList after adding \"A++\" at the index \"0\": " + arrayList);


        //Remove an element from the ArrayList, Remove at an index
        arrayList.remove(6);
        System.out.println("Elements in the ArrayList after removing element at the index \"6\": " + arrayList);

        //Update the element at a specific index
        arrayList.set(4, "D++");
        System.out.println("Elements in the ArrayList after Update the element at a specific index \"4\": " + arrayList);

        //Check the element is present at a particular index
        int number = 6;
        if (number == arrayList.indexOf("G")) {
            System.out.println("Check Element \"G\" is present in the index \"6\": True");
        } else {
            System.out.println("Check Element \"G\" is present in the index \"6\": False");
        }

        //Get an element at a particular index
        System.out.println("Get an element at a particular index \"5\": " + arrayList.get(5));

        //Find out the size of the ArrayList
        System.out.println("Size of the ArrayList: " +arrayList.size());

        //Check the given element is present in the ArrayList
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the element to find in the ArrayList: ");
        String element = scanner.nextLine();
        System.out.println("Given element is present in the ArrayList: " + arrayList.contains(element));

        //Remove all elements of the ArrayList
        arrayList.clear();
        System.out.println("Arraylist after removing all the elements: " + arrayList);
    }
}
