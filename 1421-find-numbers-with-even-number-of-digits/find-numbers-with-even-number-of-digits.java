class Solution {
    public int findNumbers(int[] nums) {
        int countEventNo=0;
       // nums = [12,345,2,6,7896]
       //
        for(int i=0;i< nums.length ;i++)
        {
            int digit = String.valueOf(nums[i]).length();
            if(digit%2==0)
                countEventNo++;
        }
        return countEventNo;
    }
}