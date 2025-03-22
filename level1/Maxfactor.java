import java.util.Scanner;
public class Maxfactor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		input.close();
		int maxFactor=10;
		int[] factor=new int[10];
		int index=0;
		for(int i=1; i<=number; i++){
			if(number%i==0){
				if(index==maxFactor){
					maxFactor*=2;
					int[] temp=new int[maxFactor];
					for(int j=0;j<factor.length;i++){
						temp[j]=factor[j];
					}
					factor=temp;
				}
				factor[index++]=i;
			}
		}
		System.out.print("Factors of "+number+" are: ");
		for(int i=0;i<index;i++){
			System.out.print(factor[i]+" ");
		}
	}
}
