import java.util.Scanner;
public class Palindrome{
	public static String reverse(String string){
		char[] reversed = new char[string.length()];
		int length = string.length();
		for(int i=0; i<length; i++){
			reversed[i]=string.charAt(length-1-i);
		}
		return new String(reversed);
	}
	public static boolean checkPalindrome(String string1, String string2){
		if(string1.equals(string2)){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		String reversedInput=reverse(string);
		boolean palindrome=checkPalindrome(string, reversedInput);
		System.out.println("The reversed string is: "+reversedInput);
		System.out.println("Is the string palindrome? "+palindrome);
	}
}