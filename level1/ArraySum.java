import java.util.Scanner;
public class ArraySum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] array=new double[10];
		double total=0;
		int count=0;
		for(int i=0;i<10;i++){
			System.out.print("Enter number: ");
			array[i]=input.nextDouble();
			if(array[i]<=0){
					break;
			}
			total+=array[i];
				count++;
		}
		input.close();
		System.out.print("the array elements are ");
		for(int i=0;i<count;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println("\nThe total value is "+total);
	}
}
