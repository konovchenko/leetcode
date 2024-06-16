package com.example.demo;

import java.util.*;

/**
 * 380. Insert Delete GetRandom O(1)
 * Implement the RandomizedSet class:
 * <p>
 * RandomizedSet() Initializes the RandomizedSet object.
 * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element
 * exists when this method is called). Each element must have the same probability of being returned.
 * You must implement the functions of the class such that each function works in average O(1) time complexity.
 */
class RandomizedSet {

    private final Map<Integer, Integer> map = new HashMap<>();
    private final ArrayList<Integer> list = new ArrayList<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        Integer index = map.get(val);
        if (index == null) {
            return false;
        }

        int lastElement = list.getLast();
        list.set(index, lastElement);
        map.put(lastElement, index);

        list.removeLast();
        map.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(new Random().nextInt(map.size()));
    }
}



public class Solution380 {

}
