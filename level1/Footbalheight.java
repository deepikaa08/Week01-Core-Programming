import java.util.Scanner;
public class Footbalheight{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] height=new double[11];
		for(int i=0;i<11;i++){
			System.out.print("Enter height of player "+(i+1)+": ");
			height[i]=input.nextDouble();
		}
		input.close();
		double sum=0;
		for(int i=0;i<11;i++){
			sum+=height[i];
		}
		double average=sum/11;
		System.out.println("The mean height of the football team is "+average);
	}
}
