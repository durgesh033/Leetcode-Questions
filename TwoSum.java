class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> maps = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int required = target - nums[i];

            if (maps.containsKey(required)){
                return new int[]{maps.get(required), i};
            }

            maps.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}