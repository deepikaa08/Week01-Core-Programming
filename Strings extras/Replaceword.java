import java.util.Scanner;
public class Replaceword{
	public static String replacement(String string, String target, String word){
		String result=string.replace(target,word);
		return result;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter sentence: ");
		String string=input.nextLine();
		System.out.print("Enter target word: ");
		String target=input.nextLine();
		System.out.print("Enter word to replace: ");
		String word=input.nextLine();
		String result1=replacement(string, target, word);
		System.out.println(result1);
	}
}
