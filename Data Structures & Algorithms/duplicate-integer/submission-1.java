
class Solution { 
    public boolean hasDuplicate(int[] nums) { 
        Set<Integer> checkedNums = new HashSet<>(); 
        
        for (int num : nums) { 
            if (checkedNums.contains(num)) { 
                return true;
            } else { 

                checkedNums.add(num); 
            } 
        } 
        return false;
    } 
}
