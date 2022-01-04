package array;

public class Array {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[] {1, 2, 3};
        int sum1 = 0;

        for(int i=0; i<nums.length; i++) {
            sum1 += nums[i];
        }
        System.out.println("총합: "+sum1);

        int sum2 = add( new int[] {1, 2, 3});
        System.out.println("총합: "+sum2);
    }

    public static int add(int[] nums) {
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

}
