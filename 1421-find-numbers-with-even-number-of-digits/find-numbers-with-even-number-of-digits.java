class Solution {
    public int findNumbers(int[] nums) {
        int countEventNo=0;
       // nums = [12,345,2,6,7896]
       //
       /*
        for(int i=0;i< nums.length ;i++)
        {
            int digit = String.valueOf(nums[i]).length();
            if(digit%2==0)
                countEventNo++;
        }
        return countEventNo;
        */

        //2nd approach
        /*
         for(int i=0;i< nums.length ;i++)
        {
            if((nums[i]>=10 && nums[i]<=99) ||
            (nums[i]>=1000 && nums[i]<=9999) ||
            (nums[i]==999999 || nums[i]==100000 ) 
             )
             {
                countEventNo++;
             }
        }
           return countEventNo;
        */

        /*
        Approach 3

        for(int i=0;i<nums.length;i++)
        {
            if(countNoOfDigits(nums[i]))
                countEventNo++;
        }
        return countEventNo;

        */

        for(int i=0;i<nums.length;i++)
        {
            int digit = (int) Math.floor(Math.log10(nums[i]))+1;
            if(digit%2==0)
                countEventNo++;
        }
        return countEventNo;
    }

    public boolean countNoOfDigits(int no)
    {
        //[12,345,2,6,7896]
        //7896 789 78  8
        int  digit=0;
        while(no!=0)
        {
            no= no/10;
            digit++;
        }
        return digit%2==0;
    }
}