class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> indices = new HashMap<>();

       for(int i = 0; i < nums.length; i++){
            indices.put(nums[i], i);
        }

       for(int j = 0; j < nums.length; j++){
            int difference = target - nums[j];
            if(indices.containsKey(difference) && indices.get(difference) != j){
                return new int[] {j, indices.get(difference)};
            }
        }
        return new int[0];
    }
}
