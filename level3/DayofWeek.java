import java.util.Scanner;
public class DayofWeek{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter date: ");
		int d=input.nextInt();
		input.nextLine();
		System.out.print("Enter month number: ");
		int m=input.nextInt();
		input.nextLine();
		System.out.print("Enter year: ");
		int y=input.nextInt();
		input.nextLine();
		input.close();
		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+31*m0/12)%7;
		switch(d0)
		{
			case 0:
				System.out.println("It is a Sunday");
				break;
			case 1:
				System.out.println("It is a Monday");
				break;
			case 2:
				System.out.println("It is a Tuesday");
				break;
			case 3:
				System.out.println("It is a Wednesday");
				break;
			case 4:
				System.out.println("It is a Thursday");
				break;
			case 5:
				System.out.println("It is a Friday");
				break;
			case 6:
				System.out.println("It is a Saturday");
				break;
		}
	}
}

				
				