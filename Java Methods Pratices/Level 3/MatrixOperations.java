import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for Matrix 1: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix 1: ");
        int cols1 = sc.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number of rows for Matrix 2: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix 2: ");
        int cols2 = sc.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nMatrix Addition:");
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] additionResult = addMatrices(matrix1, matrix2);
            displayMatrix(additionResult);
        } else {
            System.out.println("Matrix addition not possible.");
        }

        System.out.println("\nMatrix Subtraction:");
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
            displayMatrix(subtractionResult);
        } else {
            System.out.println("Matrix subtraction not possible.");
        }

        System.out.println("\nMatrix Multiplication:");
        if (cols1 == rows2) {
            int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
            displayMatrix(multiplicationResult);
        } else {
            System.out.println("Matrix multiplication not possible.");
        }

        System.out.println("\nTranspose of Matrix 1:");
        int[][] transposeMatrix1 = transposeMatrix(matrix1);
        displayMatrix(transposeMatrix1);

        System.out.println("\nTranspose of Matrix 2:");
        int[][] transposeMatrix2 = transposeMatrix(matrix2);
        displayMatrix(transposeMatrix2);

        System.out.println("\nDeterminant of Matrix 1:");
        if (rows1 == 2 && cols1 == 2) {
            System.out.println(determinant2x2(matrix1));
        } else if (rows1 == 3 && cols1 == 3) {
            System.out.println(determinant3x3(matrix1));
        }

        System.out.println("\nInverse of Matrix 1:");
        if (rows1 == 2 && cols1 == 2) {
            displayMatrix(inverse2x2(matrix1));
        } else if (rows1 == 3 && cols1 == 3) {
            displayMatrix(inverse3x3(matrix1));
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        int det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }

    public static int[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }
        int[][] inverse = new int[2][2];
        inverse[0][0] = matrix[1][1];
        inverse[0][1] = -matrix[0][1];
        inverse[1][0] = -matrix[1][0];
        inverse[1][1] = matrix[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inverse[i][j] /= determinant;
            }
        }
        return inverse;
    }

    public static int[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }

        int[][] adj = new int[3][3];
        adj[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adj[0][1] = matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2];
        adj[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adj[1][0] = matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2];
        adj[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adj[1][2] = matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2];
        adj[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        adj[2][1] = matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1];
        adj[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        int[][] inverse = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[i][j] / det;
            }
        }
        return inverse;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
