class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0) return false;
        int m = matrix[0].length;
        int curr_x = m - 1;
        int curr_y = 0;
        while (true) {
            if (curr_x < 0 || curr_y > n - 1) {
                return false;
            }
            int curr_num = matrix[curr_y][curr_x];
            if (curr_num == target) {
                return true;
            } else if (curr_num > target) {
                curr_x -= 1;
            } else {
                curr_y += 1;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int tar = 5;
        Solution s = new Solution();
        System.out.println(s.findNumberIn2DArray(matrix, tar));
    }
}