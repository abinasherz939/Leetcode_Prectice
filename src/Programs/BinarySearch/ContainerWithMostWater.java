package Programs.BinarySearch;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int maxWater = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                maxWater = Math.max(maxWater, Math.min(height[i], height[j])*(j-i));
            }
        }
        return maxWater;
    }

}
