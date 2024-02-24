public class Question_1 {
//    given a matrix of size n*n, find the sum of all possible submatrix
    public static void main(String[] args) {
//        int[][] matrix = new int[4][4];
//        matrix[0][0] = 1;
//        matrix[0][1] = 2;
//        matrix[0][2] = 3;
//        matrix[0][3] = 4;
//        matrix[1][0] = 5;
//        matrix[1][1] = 6;
//        matrix[1][2] = 7;
//        matrix[1][3] = 8;
//        matrix[2][0] = 9;
//        matrix[2][1] = 10;
//        matrix[2][2] = 11;
//        matrix[2][3] = 12;
//        matrix[3][0] = 13;
//        matrix[3][1] = 14;
//        matrix[3][2] = 15;
//        matrix[3][3] = 16;
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        System.out.println("sum of all possible submatrix : "+solution(matrix));
    }
    static int solution(int[][] matrix){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                sum = sum + (i+1) * (j+1) * (matrix.length-i) * (matrix[0].length-j) * matrix[i][j];
            }
        }
        return sum;
    }
}
