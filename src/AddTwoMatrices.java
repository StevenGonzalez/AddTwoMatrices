/*
 * Author: Steven Gonzalez
 * Last modified: 2/17/16
 */

package addTwoMatrices;
import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		
		// Create local variables for each matrix and scanner object.
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] matrix3 = new double[3][3];
		Scanner input = new Scanner(System.in);
		
		// Prompt user for numbers for the first matrix.
		System.out.println("Enter Matrix 1 one number at a time: ");		
		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				matrix1[row][column] = input.nextDouble();
			}
		}
		
		// Prompt user for numbers for the second matrix.
		System.out.println("Enter Matrix 2 one number at a time: ");
		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				matrix2[row][column] = input.nextDouble();
			}
		}
		
		// Use the addMatrix function to add the two matrices.
		matrix3 = addMatrix(matrix1, matrix2);
		
		// Output the sum of the two matrices to the user.
		for (int row = 0; row < matrix3.length; row++) {
			for (int column = 0; column < matrix3[row].length; column++) {
				System.out.print(matrix3[row][column] + " ");
			}
		}		
		
		// Close scanner object.
		input.close();
	}

	// Go through each index of the two matrices and add their sum to a third matrix
	// and then return the third matrix
	public static double[][] addMatrix(double[][] a, double[][] b) {
		
		double[][] c = new double[3][3];
		
		for (int row = 0; row < c.length; row++) {
			for (int column = 0; column < c[row].length; column++) {
				c[row][column] = a[row][column] + b[row][column];
			}
		}		
		
		return c;
	}
}
