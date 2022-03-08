package Programs.StacksAndQueues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class LRUCache {

    HashMap<Integer, Integer> hashMap = new HashMap<>();
    Queue<Integer> queue = new LinkedList<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        return hashMap.getOrDefault(key, -1);

    }

    public void put(int key, int value) {
        if (queue.size() > capacity){

            queue.poll();
            if (hashMap.containsKey(key)) {
                queue.remove(key);
                hashMap.put(key,value );
                queue.add(key);
            }
            else {
                queue.add(key);
                hashMap.put(key,value );
            }
        }
        else {
            if (hashMap.containsKey(key)) {
                queue.remove(key);
                hashMap.put(key,value );
                queue.add(key);
            }
            else {
                queue.add(key);
                hashMap.put(key,value );
            }
        }

    }
}