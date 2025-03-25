import java.util.Scanner;
public class Togglecase{
	public static String caseConvert(String string){
		String text="";
		for(int i=0; i<string.length(); i++){
			char character=string.charAt(i);
			if(character>='A'&&character<='Z'){
				text+=(char)(character+32);
			}
			else if(character>='a'&&character<='z'){
				text+=(char)(character-32);
			}
			else{
				text+=character;
			}
		}
		return text;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		String result=caseConvert(string);
		System.out.println("The string after case conversion is: "+result);
	}
}

