public class Question_4 {
//    given a matrix of 0/1 & all the rows are sorted (ascending).
//    find the max no. of ones in the any row.
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[0][2] = 0;
        matrix[0][3] = 1;
        matrix[0][4] = 1;
        matrix[1][0] = 0;
        matrix[1][1] = 1;
        matrix[1][2] = 1;
        matrix[1][3] = 1;
        matrix[1][4] = 1;
        matrix[2][0] = 0;
        matrix[2][1] = 0;
        matrix[2][2] = 1;
        matrix[2][3] = 1;
        matrix[2][4] = 1;
        matrix[3][0] = 0;
        matrix[3][1] = 0;
        matrix[3][2] = 0;
        matrix[3][3] = 0;
        matrix[3][4] = 0;
        matrix[4][0] = 1;
        matrix[4][1] = 1;
        matrix[4][2] = 1;
        matrix[4][3] = 1;
        matrix[4][4] = 1;
        System.out.println("max no. of 1's : "+maxNoOf1s(matrix));
    }
    static int maxNoOf1s(int[][] matrix){
        int i=0;
        int j= matrix[0].length-1;
        int cnt = 0;
        while(i<matrix.length && j>=0) {
            if (matrix[i][j] == 1) {
                cnt++;
                j--;
            } else {
                i++;
            }
        }
        return cnt;
    }
}
