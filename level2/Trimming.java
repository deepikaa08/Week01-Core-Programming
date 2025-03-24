import java.util.Scanner;
public class Trimming{
	public static int[] findEnds(String string){
		int start=0, end=string.length()-1;
		while(start<=end && string.charAt(start)==' '){
			start++;
		}
		while(end>=start&&string.charAt(end)==' '){
			end--;
		}
		return new int[]{start, end};
	}
	public static String stringOutput(String string, int start, int end){
		String result="";
		for(int i=start; i<=end; i++){
			result+=string.charAt(i);
		}
		return result;
	}
	public static boolean compare(String string1, String string2){
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
		int[] indices=findEnds(string);
		int start=indices[0], end=indices[1];
		String customTrim=(start<=end)? stringOutput(string, start, end): "";
		String builtinTrim=string.trim();
		boolean isSame= compare(customTrim, builtinTrim);
		System.out.println("String after custom trimming: "+customTrim);
		System.out.println("String after built-in trimming: "+builtinTrim);
		System.out.println("Are the strings the same? "+isSame);
	}
}


		