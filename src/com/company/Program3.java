package com.company;

//Create a HashSet with at least 10 elements of type String
//Write program covering all the operations of HashSet

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Program3 {
    public static void main(String[] args) {
        //Create a HashSet with at least 10 elements of type String
        HashSet<String> hashSet = new HashSet<>(10);
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("G");
        hashSet.add("G");
        hashSet.add("H");
        System.out.println("Elements in HashSet: " + hashSet);

        //Create HashSet from Collection
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,  "E", "F", "G", "G",  "H", "I", "J", "K", "K");
        HashSet<String> hashSet1 = new HashSet<>(collection);
        System.out.println("Elements in HashSet1: " + hashSet1);

        //Union operation
        hashSet.addAll(hashSet1);
        System.out.println("Result of  HashSet after Union Operation: " + hashSet);

        //Intersection Operation
        hashSet.retainAll(hashSet1);
        System.out.println("Result of HashSet after Intersection Operation: " + hashSet);

        //Difference Operation
        hashSet.add("L");
        hashSet.add("M");
        System.out.println("Elements in HashSet: " + hashSet);
        hashSet.removeAll(hashSet1);
        System.out.println("Result of HashSet after Difference Operation: " + hashSet);

    }
}
