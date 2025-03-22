import java.util.Scanner;
public class Multiplicationtable{
	public static void main(String[] args0){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		input.close();
		int[] mul=new int[10];
		for(int i=0;i<10;i++){
			mul[i]=n*(i+1);
		}
		System.out.println("Multiplication table of "+n);
		for(int i=0;i<10;i++){
			System.out.println(n+" * "+(i+1)+" = "+mul[i]);
		}
	}
}

