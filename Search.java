import java.util.stream.IntStream;

public class Search {
    public static void main(String[] args) {
        int nums[] = IntStream.range(0, 1000).toArray();
        int target = 11;

        int result = BinarySearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by Linear: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear: " + steps);
        return -1;
    }

    public static int BinarySearch(int[] nums, int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;
        int mid;
        
        while (left <= right) {
            steps++;
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Steps taken by Binary: " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        System.out.println("Steps taken by Binary:  " + steps);
        return -1;
    }
}