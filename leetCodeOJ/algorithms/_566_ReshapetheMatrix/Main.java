public class Solution {

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int rowLen = nums.length;
        int colLen = nums[0].length;

        if (rowLen * colLen != r * c) {
            return nums;
        }

        int row = 0;
        int col = 0;

        int[][] result = new int[r][c];

        for (int i = 0; i < rowLen; i++) {

            for (int j = 0; j < colLen; j++) {

                result[row][col] = nums[i][j];

                col++;

                if (col == c) {

                    col = 0;
                    row++;

                }

            }

        }

        return result;

    }

}
