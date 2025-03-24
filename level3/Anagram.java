import java.util.Scanner;
import java.util.Arrays;
public class Anagram{
	public static int[] charFrequency(String string){
		int[] charFreq=new int[256];
		for(char ch: string.toCharArray()){
			charFreq[ch]++;
		}
		return charFreq;
	}
	public static boolean isAnagram(String string1, String string2){
		if(string1.length()!=string2.length()){
			return false;
		}
		int[] s1=charFrequency(string1);
		int[] s2=charFrequency(string2);
		return Arrays.equals(s1,s2);
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string1=input.nextLine().replaceAll("\\s+","").toLowerCase();
		System.out.print("Enter string: ");
		String string2=input.nextLine().replaceAll("\\s+","").toLowerCase();
		boolean isEqual=isAnagram(string1,string2);
		System.out.println("Are the strings anagrams? "+isEqual);
	}
}
