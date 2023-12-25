
/*
 * DETERMINANT OF MATRIX
 * 
 * 
 * Given a square matrix of size n*n. The task is to find the determinant of this matrix.

Example 1:

Input:
n = 4
matrix[][] = {{1, 0, 2, -1},
              {3, 0, 0, 5},
              {2, 1, 4, -3},
              {1, 0, 5, 0}}
Output: 30
Explanation:
Determinant of the given matrix is 30.
 */


 
class Solution
{
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int mat[][], int n)
    {
        // code here 
        
        if(n==1) return mat[0][0];
        if(n==2)  return mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0];
        
        int det=0;
        
        
        for(int i=0;i<n;i++){
            int cof = (int)Math.pow(-1,i)*mat[0][i]*determinantOfMatrix(subMatrix(mat,0,i),n-1);
            det+=cof;
        }
        return det;
    }
    
    static int[][] subMatrix(int mat[][], int r, int c){
        
        
        int n = mat.length;
        
        int[][] arr = new int[n-1][n-1];
        int row =0, col=0;
        
        
        for(int i=0;i<n;i++){
            if(i!=r){
                for(int j=0;j<n;j++){
                    if(j!=c){
                        arr[row][col] = mat[i][j];
                        col++;
                    }
                }
                col=0;
                row++;
            }
        }
        return arr;
    }
}
