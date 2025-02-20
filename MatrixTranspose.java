import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix=new int[3][3];
        int [][] matrix_transpose=new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 9 numbers for 3x3 matrix: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Entered Matrix");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix: ");
        for(int i=0;i<matrix_transpose.length;i++){
            for(int j=0;j<matrix_transpose.length;j++){
                matrix_transpose[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<matrix_transpose.length;i++){
            for(int j=0;j<matrix_transpose.length;j++){
                System.out.print(matrix_transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}