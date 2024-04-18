public class TriangularSum {
    public static int triangularSum(int[] nums) {
        int out = 0;
        if(nums.length==1) return nums[0];

        while(nums.length>1){
            int[] newNums = new int[nums.length-1];
            for(int i=0; i<newNums.length; i++){
                newNums[i] = (nums[i]+nums[i+1])%10;
            }
            nums = newNums;
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(triangularSum(nums));
    }
}
