import java.util.Scanner;
public class OddandEven{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
			if(i%2==0)
				System.out.println(i+" is Even");
			else
				System.out.println(i+" is Odd");
	}
}