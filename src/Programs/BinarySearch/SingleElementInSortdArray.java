package Programs.BinarySearch;

public class SingleElementInSortdArray {
//    public int singleNonDuplicate(int[] nums) {
//        if (nums.length == 1) return nums[0];
//        int low = 0;
//        int high = nums.length-1;
//        int result = 0;
//        while (low<=high){
//            int mid  = low + (high-low)/2;
//            if (nums[mid] < nums[mid+1] && nums[mid-1] <nums[mid]){
//                result = nums[mid];
//                return result;
//            }
//            else if (mid == 0&&nums[1] == nums[0]) return nums[0];
//            else if (mid == nums.length-1&&nums[nums.length-1] == nums[nums.length-2]) return nums[nums.length-1];
//            else if(mid%2 == 0 && nums[mid-1] != nums[mid]){
//                low = mid+1;
//            }
//            else high = mid-1;
//        }
//        return result;
//    }


    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        int low = 0;
        int high = nums.length-2;
        int result = 0;
        while (low<=high){
            int mid  = low + (high-low)/2;
            if (mid == 0&&nums[1] == nums[0]) return nums[0];

            else if (nums[mid] < nums[mid+1] && nums[mid-1] <nums[mid]){
                result = nums[mid];
                return result;
            }
//            else if (mid == nums.length-1&&nums[nums.length-1] == nums[nums.length-2]) return nums[nums.length-1];
            else if(mid%2 == 0 && nums[mid-1] != nums[mid]){
                low = mid+1;
            }
            else high = mid-1;
        }
        return result;
    }
}
