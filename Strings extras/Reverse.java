import java.util.Scanner;
public class Reverse{
	public static String reverse(String string){
		char[] reversed = new char[string.length()];
		int length = string.length();
		for(int i=0; i<length; i++){
			reversed[i]=string.charAt(length-1-i);
		}
		return new String(reversed);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		String reversedInput=reverse(string);
		System.out.println("The reversed string is: "+reversedInput);
	}
}