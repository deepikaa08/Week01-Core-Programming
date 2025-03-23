import java.util.Scanner;
public class StudentVoteChecker{
	public static boolean canStudentVote(int age){
		if(age<0)
			return false;
		else
			return age>=18;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int array[]=new int[10];
		for(int i=0; i<10; i++){
			System.out.print("Enter age of student "+(i+1)+": ");
			array[i]=input.nextInt();
		}
		for(int i=1; i<array.length; i++)
			System.out.println("Can student "+(i+1)+" vote?"+canStudentVote(array[i]));
	}
}

			
