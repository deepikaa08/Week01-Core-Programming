import java.util.Scanner;
public class Leapyear{
	public static int leapyear(int year){
		if(year>=1582){
			if(year%4==0||year%400==0)
				return 1;
			else if(year%4==0&&year%100!=0)
				return 1;
			else
				return 0;
		}
		else
			return -1;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year: ");
		int year=input.nextInt();
		int result=leapyear(year);
		if(result==1)
			System.out.println("It is a leap year");
		else if(result==0)
			System.out.println("It is not a leap year");
		else
			System.out.println("It is less that 1582 in the Gregorian calendar");
	}
}
