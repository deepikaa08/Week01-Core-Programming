import java.util.Scanner;
public class Multiplicationtable{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		for(int i=6;i<=9;i++)
			System.out.println(n+"*"+i+"="+(n*i));
	}
}