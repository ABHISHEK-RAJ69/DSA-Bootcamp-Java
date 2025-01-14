package Lectures;

class MissingNumber$268{
    public int missingNumber(int[] nums) {

        // Mathematical solution

        int n = nums.length ;
        int fSum = n*(n+1)/2;
        int sum = 0;
        for(int k : nums){
            sum+=k;
        }
        return fSum-sum;
    }

    public int M1_Short(int[] nums){

        // CYCLIC SHORT solution

        sort(nums);
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    public void sort(int[] nums){
        int i = 0 ;
        while( i < nums.length){
            if(nums[i] <nums.length && nums[i] != nums[nums[i]]){
                swap(nums ,i , nums[i] );
            }else {
                i++;
            }
        }
    }


    static  void swap(int[] arr , int index ,int correct){
        int temp = arr[correct];
        arr[correct] = arr[index];
        arr[index] = temp;
    }
}