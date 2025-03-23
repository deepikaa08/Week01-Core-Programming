import java.util.Scanner;
public class Chocolates{
	public static int[] findReminderandQuotient(int chocolate, int students){
		int quotient=chocolate/students;
		int reminder=chocolate%students;
		return new int[]{quotient, reminder};
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of chocolates: ");
		int chocolate=input.nextInt();
		System.out.print("Enter number of students: ");
		int students=input.nextInt();
		int result[]=findReminderandQuotient(chocolate, students);
		System.out.println("The number of chocolates each child gets is "+result[0]+" and "+result[1]+" chocolate remain." );
	}
}
