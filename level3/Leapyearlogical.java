import java.util.Scanner;
public class Leapyearlogical{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year: ");
		int year=input.nextInt();
		if(year>=1582){
			if(year%4==0&&year%400==0)
				System.out.println(year+" is a Leap year");
			else
				System.out.println(year+" is not a Leap year");
		}
		else
			System.out.println(year+" is not a Leap year");
	}
}
