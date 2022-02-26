package Programs;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindKthSmallestElement {
    public static void main(String[] args) {
        int[] input = {1,3,24,25,21,1,400,5,2,-1,1,4,5,5,6,6,47,47,0};

        int k = new Scanner(System.in).nextInt();

        FindKthSmallestElement obj = new FindKthSmallestElement();
        System.out.println(obj.findKthElement(input,k));





    }

    public int findKthElement(int[] input, int k){
        if (input.length<k) return -999;//if k is out of Bound

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int kthElement = 0;
        for (int i :
                input) {
            minHeap.add(i);
        }
        System.out.println(minHeap);
        for (int i = 0; i < k; i++) {
            kthElement = minHeap.poll();
        }
        return kthElement ;
    }

}
