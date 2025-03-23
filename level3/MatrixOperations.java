import java.util.Scanner;
public class MatrixOperations {
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        return matrix;
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double num : row) {
                System.out.printf("%8.2f", num);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static double[][] addMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = B[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
    public static double determinant2x2(double[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }
        double invDet = 1.0 / det;
        return new double[][] {
            { invDet * matrix[1][1], -invDet * matrix[0][1] },
            { -invDet * matrix[1][0], invDet * matrix[0][0] }
        };
    }
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }
        double invDet = 1.0 / det;
        double[][] inverse = new double[3][3];
        inverse[0][0] = invDet * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        inverse[0][1] = -invDet * (matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        inverse[0][2] = invDet * (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]);

        inverse[1][0] = -invDet * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        inverse[1][1] = invDet * (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]);
        inverse[1][2] = -invDet * (matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);

        inverse[2][0] = invDet * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        inverse[2][1] = -invDet * (matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        inverse[2][2] = invDet * (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);

        return inverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        double[][] A = generateMatrix(rows, cols);
        double[][] B = generateMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("A + B:");
        displayMatrix(addMatrices(A, B));

        System.out.println("A - B:");
        displayMatrix(subtractMatrices(A, B));

        if (rows == cols) {
            System.out.println("A * B:");
            displayMatrix(multiplyMatrices(A, B));

            System.out.println("Transpose of A:");
            displayMatrix(transposeMatrix(A));

            if (rows == 2) {
                System.out.println("Determinant of A: " + determinant2x2(A));
				System.out.println();
                double[][] inverseA = inverse2x2(A);
                if (inverseA != null) {
                    System.out.println("Inverse of A:");
                    displayMatrix(inverseA);
                }
            } else if (rows == 3) {
                System.out.println("Determinant of A: " + determinant3x3(A));
                double[][] inverseA = inverse3x3(A);
                if (inverseA != null) {
                    System.out.println("Inverse of A:");
                    displayMatrix(inverseA);
                }
            }
        } else {
            System.out.println("Matrix multiplication, determinant, and inverse only work for square matrices.");
        }

        input.close();
    }
}
