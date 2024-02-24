public class Question_2 {
//    given a 2d matrix of size n*n.
//    all the rows & all the columns are sorted in descending order.
//    find the max sum submatrix.(size>=1)
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;
        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;
        matrix[3][0] = 13;
        matrix[3][1] = 14;
        matrix[3][2] = 15;
        matrix[3][3] = 16;
        System.out.println("Max Sum : "+maxSumSubmatrix(matrix));
    }
    static int maxSumSubmatrix(int[][] matrix){
        int[][] preMat = PrefixMatrix.prefixMatrix(matrix);
        int max=Integer.MIN_VALUE;
        for(int i=0;i< preMat.length;i++){
            for(int j=0;j<preMat[0].length;j++){
                max = Math.max(max,preMat[i][j]);
            }
        }
        return max;
    }
}
