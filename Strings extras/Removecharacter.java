import java.util.Scanner;
public class Removecharacter{
	public static String removed(String string, char character){
		String text="";
		for(int i=0; i<string.length(); i++){
			if(string.charAt(i)!=character){
				text+=string.charAt(i);
			}
		}
		return text;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		System.out.print("Enter character to remove: ");
		char character=input.next().charAt(0);
		String result=removed(string, character);
		System.out.println("After removing character: "+result);
	}
}
