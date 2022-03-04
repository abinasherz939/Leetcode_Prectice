package Programs.BinarySearch;

public class FindMinInRotedSortedArray {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        int resultIndex = 0,low = 0;
        int high = nums.length-1;
        // if (nums[low] <nums[high]) return nums[low];
        while (low <= high){
            if (nums[low] <nums[high]) return nums[low];
            int mid = low + (high+1-low)/2;
            resultIndex = mid;
            // if (mid== 0) return nums[0];
            if (mid>0&&mid<nums.length-1 &&nums[mid]<nums[mid-1]&& nums[mid]<nums[mid+1]) return nums[mid];
            else if (mid== 0) return nums[0];
            else if(mid==nums.length -1) return nums[nums.length -1];
            else if (nums[low] < nums[mid]) low = mid+1;
            else high = mid-1;
        }
        return nums[resultIndex];
    }
}
