class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        int len = nums.length;
        for(int i = 0; i < len; i++){
            for(int j=0; j < len; j++) {
                if (i != j) {
                    if(nums[i] + nums[j] == target){
                        arr[0] = i;
                        arr[1] = j;
                        return arr;
                    }
                }
            }
        }
        return arr;
    }
}


This is the brute force method i created through my own ideology...
Time complexity - O(n2) (Not optimized)

It can be optimized more through Hash Map... But right now i don't know how to use hash map
so tommrow i'll learn that