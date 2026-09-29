class Solution {
    public int search(int[] nums, int target) {
        for(int num = 0; num < nums.length; num++){
            if(nums[num] == target){
                return num;
            }
        } return -1;
    }
}
