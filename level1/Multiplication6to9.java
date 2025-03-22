import java.util.Scanner;
public class Multiplication6to9{
	public static void main(String[] args0){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		input.close();
		int[] mul=new int[4];
		for(int i=6;i<10;i++){
			mul[i-6]=n*i;
		}
		System.out.println("Multiplication table of "+n);
		for(int i=6;i<10;i++){
			System.out.println(n+" * "+i+" = "+mul[i-6]);
		}
	}
}