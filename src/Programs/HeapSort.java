package Programs;

import org.jetbrains.annotations.NotNull;
import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        int[] input = {1,3,24,25,21,1,400,5,2,-1,1,4,5,5,6,6,47,47,0};
        int[] res = new HeapSort().heapSort(input);
        for (int i :
                res) {
            System.out.print(i +" ");
        }
        System.out.println("\n{"+ input.length+ ", "+ res.length+"}");
    }
    public int[] heapSort(int @NotNull [] array){
        int[] resultArray = new int[array.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : array) minHeap.offer(i);
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = minHeap.poll();
        }
        return resultArray;
    }
}
