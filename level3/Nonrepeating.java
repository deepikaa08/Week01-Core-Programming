import java.util.Scanner;
public class Nonrepeating{
	public static char firstNonrepeat(String string){
		int[] frequency= new int[256];
		for(int i=0; i<string.length(); i++){
			char currentChar=string.charAt(i);
			frequency[currentChar]++;
		}
		for(int i=0; i<string.length(); i++){
			char  currentChar = string.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; 
            }
        }

        return '\0'; 
    }
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		char result=firstNonrepeat(string);
		if(result!='\0'){
			System.out.println("First non repeating character is: "+result);
		}
		else
			System.out.println("No non repeating character");
	}
}
