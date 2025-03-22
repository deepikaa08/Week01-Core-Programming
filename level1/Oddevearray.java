import java.util.Scanner;
public class Oddevearray{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		if(number<=0){
			System.out.println("error");
		}
		input.close();
		int[] even=new int[(number/2)+1];
		int[] odd=new int[(number/2)+1];
		int evenIndex=0, oddIndex=0;
		for(int i=0;i<=number;i++){
				if(i%2==0){
					even[evenIndex++]=i;
				}
				else{
					odd[oddIndex++]=i;
				}
		}
		System.out.print("The even array elements are ");
		for(int i=0;i<evenIndex;i++){
			System.out.print(even[i]+" ");
		}
		System.out.print("\nThe odd array elements are ");
		for(int i=0;i<oddIndex;i++){
			System.out.print(odd[i]+" ");
		}
	}
}