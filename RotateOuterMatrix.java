import java.util.Scanner;

public class RotateOuterMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter 9 elements for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateOuterClockwise(matrix);

        System.out.println("Matrix after rotating outer elements clockwise:");
        printMatrix(matrix);

        scanner.close();
    }

    public static void rotateOuterClockwise(int[][] matrix) {

        int temp = matrix[0][2];

        matrix[0][2] = matrix[0][1];
        matrix[0][1] = matrix[0][0];

        matrix[0][0] = matrix[1][0];
        matrix[1][0] = matrix[2][0];

        matrix[2][0] = matrix[2][1];
        matrix[2][1] = matrix[2][2];

        matrix[2][2] = matrix[1][2];
        matrix[1][2] = temp;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}