import java.util.Scanner;
public class Chararray{
	public static char[] characters(String string){
		char chars[]=new char[string.length()];
		for(int i=0; i<string.length(); i++)
			chars[i]=string.charAt(i);
		return chars;
	}
	public static boolean compareArrays(char[] chars, char[] chars1){
		if(chars.length!=chars1.length)
			return false;
		for(int i=0; i<chars.length; i++){
			if(chars[i]!=chars1[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		char[] charArray=characters(string);
		System.out.println("Character array without using toCharArray(): ");
		for(int i=0; i<charArray.length; i++){
			System.out.print(charArray[i]+" ");
		}
		System.out.println();
		char[] builtArray=string.toCharArray();
		for(int i=0; i<builtArray.length; i++){
			System.out.print(builtArray[i]+" ");
		}
		System.out.println();
		boolean results=compareArrays(charArray, builtArray);
		System.out.println("Are the arrays equal? "+results);
	}
}
