package com.company;

/*Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map
 */

import java.util.HashMap;

public class Program2 {
    public static void main(String[] args) {
        //Create a HashMap with at least 10 key value pairs of the Student ID and Name
        HashMap<Integer, String> hashMap = new HashMap<>(10);
        hashMap.put(1, "Abinav");
        hashMap.put(2, "Brindha");
        hashMap.put(3, "Chitra");
        hashMap.put(4, "Dinesh");
        hashMap.put(5, "Edwin");
        hashMap.put(6, "Farina");
        hashMap.put(7, "Gowtham");
        hashMap.put(8, "Hashica");
        hashMap.put(9, "Ishwarya");
        hashMap.put(10, "Jenni");

        //Insert a Key value mapping into the map
        hashMap.put(11, "Keerthana");
        System.out.println("HashMap contains: " + hashMap);

        //Fetch the value of a Key
        System.out.println("Fetch the value of a key \"5\" is: " +hashMap.get(5));

        //Create a clone/copy of HashMap
        System.out.println("copy of HashMap is: " + hashMap.clone());

        //Check if the given Key is in the Map
        System.out.println("Check \"Key 8\" is in the HashMap: " + hashMap.containsKey(8));

        //Check if the value is in the Map
        System.out.println("Check \"Value Chitra\" is in the HashMap: " + hashMap.containsValue("Chitra"));

        //Check if the map is empty
        System.out.println("Check if the map is empty: " + hashMap.isEmpty());

        //Print the size of the Map to the console
        System.out.println("Size of the Map: " + hashMap.size());

        //Print all the Keys of the map to the console
        System.out.println("Keys of the map: " + hashMap.keySet());

        //Print all the values of the map to the console
        System.out.println("Values of the map: " + hashMap.values());

        //Remove a specific Key-value pair
        hashMap.remove(2, "Brindha");
        System.out.println("HashMap after removing the key valule pair \"(2,Brindha)\": " + hashMap );

        //Copy all the elements of the Map to another Map
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.putAll(hashMap);
        System.out.println("HashMap1 contains: " + hashMap1);
    }
}
