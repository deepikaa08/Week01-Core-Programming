import java.util.Scanner;
public class Palindrome{
	public static boolean check(String string){
		string=string.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		int left=0, right=string.length()-1;
		while(left<right){
			if(string.charAt(left)!=string.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void displayResult(String string, boolean result){
		if(result){
			System.out.println(string+" is a palindrome");
		}
		else{
			System.out.println(string+" is not a palindrome");
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		boolean results=check(string);
		displayResult(string, results);
	}
}
