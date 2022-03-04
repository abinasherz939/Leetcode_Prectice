package Programs.BinarySearch;

import java.util.Collections;

public class SerachInRotatedArray {

//    public int search(int[] nums, int target) {
//
////        int low = 0;
////        int high = nums.length-1;
////        if (nums[low] <nums[high]) return low;
////        while (low<= high){
////            int mid = low + (high-low)/2;
////            if (nums[mid]<nums[mid-1]&& nums[mid]<nums[mid+1]) return nums.length- mid;
////            else if (nums[low] < nums[mid]) low = mid+1;
////            else high = mid-1;
////        }
////        return -1;
//    }

    public int search(int[] nums, int target) {

        int minimumIndex = findMinIndex(nums);

        Math.max(binraySearch(nums, target, 0, minimumIndex-1), binraySearch(nums, target, minimumIndex+1, nums.length));

        return -1;
    }
    public int binraySearch(int[]nums,int target, int fromIndex, int tillIndex){
        if (fromIndex <0 || tillIndex > nums.length-1) return -1;
        int low = fromIndex;
        int high = tillIndex;
        while (low<=high){
            int mid = low+(high-low+1)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] <target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }


    public int findMinIndex(int[] nums) {
        if (nums.length == 1) return 0;
        int resultIndex = 0,low = 0;
        int high = nums.length-1;
        // if (nums[low] <nums[high]) return nums[low];
        while (low <= high){
            if (nums[low] <nums[high]) return low;
            int mid = low + (high+1-low)/2;
            resultIndex = mid;
            // if (mid== 0) return nums[0];
            if (mid>0&&mid<nums.length-1 &&nums[mid]<nums[mid-1]&& nums[mid]<nums[mid+1]) return mid;
            else if (mid== 0) return 0;
            else if(mid==nums.length -1) return nums.length -1;
            else if (nums[low] < nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return resultIndex;
    }
}
