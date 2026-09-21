class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupes = new HashSet<>(); 
        for(int num : nums) {
            if(!dupes.add(num))
                return true; 
        }
        return false; 
    }
}