import java.util.Scanner;
public class Naturalnumbersum{
	public static int sum(int n){
		int add=0;
		for(int i=1;i<=n;i++)
			add+=i;
		return add;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		int result=sum(n);
		System.out.println("The sum of "+n+" numbers is "+result);
	}
}
