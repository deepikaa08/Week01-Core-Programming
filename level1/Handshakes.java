import java.util.Scanner;
public class Handshakes{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int numberOfStudents=input.nextInt();
		int handshake=(numberOfStudents*(numberOfStudents-1))/2;
		System.out.println("The total number of possible handshakes between "+numberOfStudents+" students is "+handshake);
	}
}

