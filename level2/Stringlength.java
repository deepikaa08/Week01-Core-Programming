import java.util.Scanner;
public class Stringlength{
	public static int lengthOfstring(String string){
		int count=0;
		try{
			while(true){
				string.charAt(count);
				count++;
			}
		}
		catch(IndexOutOfBoundsException e){
			return count;
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		int resultString=lengthOfstring(string);
		int resultString1=string.length();
		System.out.println("Length of string (manually): "+resultString);
		System.out.println("Length of string (inbuilt): "+resultString1);
	}
}
