package Programs.BinarySearch;

public class PeakElement {

    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        int low = 0;
        int high = nums.length -1;
        while (low<= high){
            int mid = low + (high -low)/2;
            if (mid == 0 && nums[0] > nums[1]) return 0;
            else if (mid == nums.length-1 && nums[nums.length-1] > nums[nums.length-2]) return nums.length -1;
            else if (nums[mid-1] < nums[mid]&& nums[mid] <nums[mid+1]) return mid;
            else if (nums[mid-1] > nums[mid]) high = mid-1;
            else low = mid+1;
        }
        return 0;
    }

}
