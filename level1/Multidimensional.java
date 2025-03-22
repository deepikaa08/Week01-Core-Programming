import java.util.Scanner;
public class Multidimensional{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows=input.nextInt();
		System.out.print("Enter number of columns: ");
		int columns=input.nextInt();
		int matrix[][]=new int[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0; j<columns;j++){
				System.out.print("Enter ["+(i)+"] ["+(j)+"]:");
				matrix[i][j]=input.nextInt();
			}
		}
		input.close();
		System.out.println("2D array is: ");
		for(int i=0;i<rows;i++){
			for(int j=0; j<columns;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		int[] array=new int[rows*columns];
		int index=0;
		for(int i=0;i<rows;i++){
			for(int j=0; j<columns;j++){
				array[index]=matrix[i][j];
				index++;
			}
		}
		System.out.println("The 1D array is: ");
		for(int i=0; i<index;i++){
			System.out.print(array[i]+" ");
		}
	}
}
