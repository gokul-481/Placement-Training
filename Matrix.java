import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3]; 

        System.out.println("Enter 9 numbers for the 3x3 matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 3; j++) { 
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The entered 3x3 matrix is:");
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 3; j++) {  
                System.out.print(matrix[i][j] + " ");  
            }
            System.out.println();
        }

        scanner.close();
    }
}