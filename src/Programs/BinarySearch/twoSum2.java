package Programs.BinarySearch;

public class twoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = {-1,-1};
        for (int index = 0; index < numbers.length; index++) {
            int complement = target - numbers[index];
            if (binarySearch(numbers, complement)!= -1){
                result[1] = binarySearch(numbers, complement)+1;
                result[0] = index+1;
                if (result[0] == result[1]) result[1]++;
                if (numbers[index]<0){
                    int temp = result[0];
                    result[0] = result[1];
                    result[1] = temp;
                }
                return result;
            }
        }
        return result;
    }

    public int binarySearch(int[] numbers, int target){
        int low = 0;
        int high = numbers.length -1;
        while(low<= high){
            int mid = low + (high-low)/2;
            if (numbers[mid] == target) return mid;
            else if (mid>0 && numbers[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}
