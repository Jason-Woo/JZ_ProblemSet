class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] mark = new int[nums.length];
        for (int num : nums) {
            if (mark[num] != 0) {
                return num;
            } else {
                mark[num] = 1;
            }
        }
        return 0;
    }
}