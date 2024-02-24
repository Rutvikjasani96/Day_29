public class Question_3 {
//    given a matrix of size n*n.
//    all th rows & all the columns of the matrix are sorted in ascending order.
//    given an element k, return true if the element is present in the matrix.
    public static void main(String[] args){
        int[][] matrix = new int[4][4];
        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        matrix[0][3] = 40;
        matrix[1][0] = 15;
        matrix[1][1] = 25;
        matrix[1][2] = 35;
        matrix[1][3] = 45;
        matrix[2][0] = 27;
        matrix[2][1] = 29;
        matrix[2][2] = 37;
        matrix[2][3] = 45;
        matrix[3][0] = 32;
        matrix[3][1] = 33;
        matrix[3][2] = 39;
        matrix[3][3] = 50;
        int val = 35;
        System.out.println("is present : "+isPresent(matrix,val));
    }
    static boolean isPresent(int[][] matrix,int val){
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && j>=0) {
            if (val < matrix[i][j]) {
                j--;
            } else if (val > matrix[i][j]) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
