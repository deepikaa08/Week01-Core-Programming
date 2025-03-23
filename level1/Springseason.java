import java.util.Scanner;
public class Springseason{
	public static int day(int month, int date){
		if((month==3&&date>=20)||(month>3&&month<6)||(month==6&&date<=20))
			return 1;
		else 
			return -1;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter month number: ");
		int month=input.nextInt();
		System.out.print("Enter date: ");
		int date=input.nextInt();
		int result=day(month, date);
		if(result==1)
			System.out.println("It's spring season");
		else if(result==-1)
			System.out.println("It's not spring season");
		else
			System.out.println("Invalid");
	}
}
