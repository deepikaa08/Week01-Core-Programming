import java.util.Scanner;
import java.util.Arrays;
public class Anagram{
	public static boolean checkAnagram(String string1, String string2){
		String s1=string1.toLowerCase();
		String s2=string2.toLowerCase();
		if(s1.length()!=s2.length()){
			return false;
		}
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String string1=input.nextLine();
		System.out.print("Enter string 2: ");
		String string2=input.nextLine();
		boolean result=checkAnagram(string1, string2);
		System.out.println("Are the words anagrams? "+result);
	}
}
