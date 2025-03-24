import java.util.Scanner;
public class Palindromelogics{
	public static boolean Logic1(String string){
		int start=0; 
		int end=string.length()-1;
		while(start<end){
			if(string.charAt(start)!=string.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static boolean Logic2(String string, int start, int end){
		if(start>=end){
			return true;
		}
		if(string.charAt(start)!=string.charAt(end)){
			return false;
		}
		return Logic2(string, start+1, end-1);
	}
		public static char[] reverseString(String string){
		char[] reversed =new char[string.length()];
		for(int i=0; i<string.length(); i++){
			reversed[i]=string.charAt(string.length()-1-i);
		}
		return reversed;
	}
	public static boolean Logic3(String string){
		char[] original=string.toCharArray();
		char[] reversed=reverseString(string);
		for(int i=0; i<original.length; i++){
			if(original[i]!=reversed[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine().replaceAll("\\s+","").toLowerCase();
		boolean result1=Logic1(string);
		boolean result2=Logic2(string,0,string.length()-1);
		boolean result3=Logic3(string);
		System.out.println("Palindrome using iteration: "+(result1? "yes":"no"));
		System.out.println("Palindrome using recursion: "+(result2? "yes":"no"));
		System.out.println("Palindrome using arrays: "+(result3? "yes":"no"));
	}
}
