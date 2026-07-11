class Solution {
    public int[] sortedSquares(int[] nums) {
        /*
        //Approach 1
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        return nums;
        */

        //Approach 2
        //nums = [-4,-1,0,3,10]
        int dups[] = new int[nums.length];
        int left=0, right=nums.length-1;
        for(int cnt= nums.length-1 ; cnt >=0;cnt--){
        if(Math.abs(nums[left]) >= Math.abs(nums[right]))
        {
            dups[cnt] = nums[left] *  nums[left];
            left++;
        }else
        {
            dups[cnt] = nums[right] *  nums[right];
            right--;
        }
            
        }
        return dups;
    }
}