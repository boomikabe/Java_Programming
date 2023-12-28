public class RearrangeArray {
    public static void rearrangeArray(int[] nums) {
        int negativePointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                swap(nums, i, negativePointer);
                negativePointer++;
            }
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] inputArray = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        rearrangeArray(inputArray);
        System.out.print("Output [");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i < inputArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}