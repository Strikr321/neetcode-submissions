class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> answer = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int currentNum = nums[index]; 
            if(answer.containsKey(target - currentNum)) {
                return new int[]{answer.get(target - currentNum), index}; 
            }
            else {
                answer.putIfAbsent(currentNum, index); 
            }
        }
        return null; 
    }
}
