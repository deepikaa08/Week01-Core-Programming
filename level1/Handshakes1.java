import java.util.Scanner;
public class Handshakes1{
	public static int total(int n){
		int handshakes=(n*(n-1))/2;
		return handshakes;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int numberOfStudents=input.nextInt();
		Handshakes1 obj=new Handshakes1();
		int handshakes=obj.total(numberOfStudents);
		System.out.println("The total number of handshakes is "+handshakes);
	}
}