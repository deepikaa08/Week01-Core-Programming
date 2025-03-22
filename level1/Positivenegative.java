import java.util.Scanner;
public class Positivenegative{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] num=new int[5];
		for(int i=0; i<num.length;i++){
			System.out.print("Enter number "+(i+1)+":");
			num[i]=input.nextInt();
		}
		input.close();
		for(int i=0;i<num.length;i++){
			if(num[i]>0){
				System.out.println(num[i]+" is a positive number. ");
				if(num[i]%2==0)
					System.out.println("It's an even number");
				else
					System.out.println("It's an odd number");
			}
			else if(num[i]<0){
				System.out.println(num[i]+" is a negative number. ");
			}
			else
				System.out.println(num[i]+" is a zero ");
		}
	}
}