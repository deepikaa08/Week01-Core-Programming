import java.util.Scanner;
public class Longestword{
	public static String longestword(String string){
		String[] words=string.split(" ");
		String longest="";
		for(String word:words){
			if(word.length()>longest.length()){
				longest=word;
			}
		}
		return longest;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String string=input.nextLine();
		String result=longestword(string);
		System.out.println("The longest word in the sentence is "+result);
	}
}
