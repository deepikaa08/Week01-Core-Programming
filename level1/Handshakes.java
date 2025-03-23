import java.util.Scanner;
public class Handshakes{
	public static int total(int n){
		int handshakes=(n*(n-1))/2;
		return handshakes;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n=input.nextInt();
		Handshakes obj=new Handshakes();
		int handshakes=obj.total(n);
		System.out.println("The total number of handshakes is "+handshakes);
	}
}
