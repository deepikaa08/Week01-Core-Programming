import java.util.Scanner;
public class Grades{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Physics marks out of 100: ");
		int physics=input.nextInt();
		input.nextLine();
		System.out.print("Enter Chemistry marks out of 100: ");
		int chemistry=input.nextInt();
		input.nextLine();
		System.out.print("Enter Maths marks out of 100: ");
		int maths=input.nextInt();
		input.nextLine();
		input.close();
		int average=(physics+chemistry+maths)/3;
		System.out.print("The average mark is "+average+".");
		if(average>=80)
			System.out.println("The rewarded is 'A'. Level-4, above agency-normalized standards");
		else if(average>=70&&average<=79)
			System.out.println("The rewarded is 'B'. Level-3, at agency-normalized standards");
		else if(average>=60&&average<=69)
			System.out.println("The rewarded is 'C'. Level-2, below-normalized standards");
		else if(average>=50&&average<=59)
			System.out.println("The rewarded is 'D'. Level-1, well below-normalized standards");
		else if(average>=40&&average<=49)
			System.out.println("The rewarded is 'E'. Level-1, below-normalized standards");
		else
			System.out.println("The rewarded is 'R'. Remedial standards");
	}
}
