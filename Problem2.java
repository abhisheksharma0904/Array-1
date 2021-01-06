// Time Complexity : O(mn) where mn is the size of matrix.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english:
// 1. Create an array for returning results and take variables i representing rows, j representing columns, idx representing index of array and dir for direction of our diagonal.
// 2. Iterate till we reach the size of our array.
// 3. everytime we reach the final index or at the edge of matrix, change the direction and keep on increaing i and j.
// 4. i will be increased in case we are changing row and j will be increased when we are changing column.
// 5. As soon as id reaches the length of array or at final index, we are done, we can return result.
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length, i = 0, j = 0, idx = 0, dir = 1;
        int[] result = new int[m*n];
        while(idx < result.length){
             result[idx] = matrix[i][j];
            if(dir == 1){
                if(j == n-1){
                    dir = -1;
                    i++;
                }else if(i == 0){
                    dir = -1;
                    j++;                 
                }else{
                    i--;
                    j++;
                }
            }else{
                  if(i == m-1){
                    dir = 1;
                    j++;
                }else if(j == 0){
                    dir = 1;
                    i++;                 
                }else{
                    j--;
                    i++;
                }
            }     
            idx++;
        }
        return result;
    }
}
// Your code here along with comments explaining your approach
