public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1
//        int[] row1 = new int[] {1,3,5,7};
//        int[] row2 = new int[] {10,11,16,20};
//        int[] row3 = new int[] {23,30,34,60};
//        int[][] matrix = new int[][] {row1, row2, row3};

        // Test Case 2
//        int[] row1 = new int[] {1};
//        int[][] matrix = new int[][] {row1};
        // Test Case 3
        // Test Case 1
        int[] row1 = new int[] {1};
        int[] row2 = new int[] {3};
        int[] row3 = new int[] {5};
        int[][] matrix = new int[][] {row1, row2, row3};

        System.out.println(sol.searchMatrix(matrix, 3));
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lowerRow = 0;
        int upperRow = matrix.length - 1;

        while (lowerRow < upperRow) {
            int middleRowIndex = (lowerRow  + upperRow) / 2;
            int middleRowFirstColumnValue = matrix[middleRowIndex][0];

            if (matrix[middleRowIndex][matrix[middleRowIndex].length -1] < target) {
                lowerRow = middleRowIndex + 1;
            } else if (middleRowFirstColumnValue > target){
                upperRow = middleRowIndex - 1;
            } else {
                lowerRow = middleRowIndex;
                upperRow = middleRowIndex;
            }
        }
        int[] row = matrix[lowerRow];
        int lowerColumn = 0;
        int upperColumn = row.length - 1;

        while (lowerColumn <= upperColumn) {
            int middleColumnIndex = (lowerColumn + upperColumn) /2;
            int middleColumnValue = row[middleColumnIndex];
            if (middleColumnValue == target) {
                return true;
            } else if (middleColumnValue < target) {
                lowerColumn = middleColumnIndex + 1;
            } else {
                upperColumn = middleColumnIndex - 1;
            }
        }
        return false;
    }
}
