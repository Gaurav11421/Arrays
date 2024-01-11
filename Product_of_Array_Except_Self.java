// leetcode 238
class Product_of_Array_Except_Self {
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] output = new int[len];
        int[] leftMul = new int[len];
        int[] rightMul = new int[len];
        leftMul[0] = 1;
        for(int i=1; i<len; i++){
            leftMul[i] = leftMul[i-1] * nums[i-1];
        }
        rightMul[len-1] = 1;
        for(int i=len-2; i>=0; i--){
            rightMul[i] = rightMul[i+1] * nums[i+1];
        }
        for(int i=0; i<len; i++){
            output[i] = leftMul[i]*rightMul[i];
        }
        return output;
    }
    public static void main(String[] args){
        //int[] nums = {1,2,3,4};
        int[] nums = {-1,1,0,-3,3};
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int[] res = productExceptSelf(nums);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}