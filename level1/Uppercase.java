import java.util.Scanner;
public class Uppercase{
	public static String toupperCase(String string){
		String result="";
		for(int i=0; i<string.length(); i++){
			char characters=string.charAt(i);
			if(characters>='a'&&characters<='z'){
				result+=(char)(characters-32);
			}
			else
				result+=characters;
		}
		return result;
	}
	public static boolean comparestrings(String string1, String string2){
		if(string1.length()!=string2.length()){
			return false;
		}
		for(int i=0; i<string1.length(); i++){
			if(string1.charAt(i)!=string2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		String manualuppercase=toupperCase(string);
		String inbuiltcase=string.toUpperCase();
		boolean isEqual=comparestrings(manualuppercase, inbuiltcase);
		System.out.println("String in uppercase (manual): "+manualuppercase);
		System.out.println("String in uppercase (in-built): "+inbuiltcase);
		System.out.println("Are the strings the same? "+isEqual);
	}
}