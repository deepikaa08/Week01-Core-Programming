import java.util.Scanner;
public class Vowels2D{
	public static String checkCharacter(char ch){
		if(ch>='A'&&ch<='Z'){
			ch=(char)(ch+32);
		}
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			return "Vowels";
		}
		else if(ch>='a'&&ch<='z'){
			return "Consonants";
		}
		else{
			return "Not a letter";
		}
	}
	public static String[][] checkString(String string){
		int length=string.length();
		String[][] result=new String[length][2];
		for(int i=0; i<length; i++){
			char ch=string.charAt(i);
			result[i][0]=String.valueOf(ch);
			result[i][1]=checkCharacter(ch);
		}
		return result;
	}
	public static void displayResults(String[][] results){
		System.out.println("\nCharacter | Type");
		System.out.println("-------------------");
		for(String[] row: results){
			System.out.printf("   %s      | %s\n", row[0], row[1]);
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		String[][] result=checkString(string);
		displayResults(result);
	}
}

		
		
