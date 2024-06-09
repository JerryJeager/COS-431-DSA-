public class insertionSort {
    public static void main(String[] args) {
        int nums[] = { 9, 3, 1, 7, 2, 4, 6, 5};
        int size = nums.length;

        for(int i = 0, j = 1; i <= size - 2 && j <= size - 1; i++, j++) {
            if(nums[j] < nums[i]) {
                int currentIndex = j;
                int valueToCheckIndex = i;
                while(currentIndex != 0 && nums[currentIndex] < nums[valueToCheckIndex]) {
                    int temp = nums[currentIndex];
                    nums[currentIndex] = nums[valueToCheckIndex];
                    nums[valueToCheckIndex] = temp;
                    --currentIndex;
                    --valueToCheckIndex;
                }
            }
        }

        for(int num : nums){
            System.out.print(num);
        }
    }

}
