package Numbers;
public class SmallerOnesInLeftAndGreaterOnesInRight {

    public int findElement() {
        int[] nums = {5, 4, 1, 2, 3, 6, 8, 7, 10, 9};
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        // Fill left max values
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], nums[i - 1]);
        }

        // Fill right min values
        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], nums[i + 1]);
        }

        // Find the valid element
        for (int i = 0; i < n; i++) {
            if (leftMax[i] <= nums[i] && nums[i] <= rightMin[i]) {
                return nums[i]; // Found the element
            }
        }

        return -1; // No valid element found
    }

    public static void main(String[] args) {
        SmallerOnesInLeftAndGreaterOnesInRight obj = new SmallerOnesInLeftAndGreaterOnesInRight();
        System.out.println(obj.findElement());
    }
}
