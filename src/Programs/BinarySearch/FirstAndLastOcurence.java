package Programs.BinarySearch;

public class FirstAndLastOcurence {

    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) return new int[] {-1,-1};
        int firstOcerence = firstOcerence(nums, target);
        int lastOcerence = lastOcerence(nums, target);
        return new int[]{Math.min(firstOcerence, lastOcerence), Math.max(firstOcerence, lastOcerence)};

    }
    public int firstOcerence(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int posibleResult = -1;
        while (low<= high){
            int mid = low +(high- low) /2;
            if (nums[mid] == target) {
                posibleResult = mid;
                high= mid-1;
            }
            else if (mid>0&& target<nums[mid]) high = mid-1;
            else low = mid+1;
        }
        return posibleResult;
    }
    public int lastOcerence(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int posibleResult = -1;
        while (low<= high){
            int mid = low +(high- low) /2;
            if (nums[mid] == target) {
                posibleResult = mid;
                low = mid+1;
            }
            else if (mid > 0 && target<nums[mid]) high = mid-1;
            else low = mid+1;
        }
        return posibleResult;
    }


}



class test{
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = firstOccurrence(nums, target);
        arr[1] = lastOccurrence(nums, target);

        return arr;
    }

    //first occurrence
    public int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                end = mid-1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }

    //last occurrence
    public int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                res = mid;
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
}