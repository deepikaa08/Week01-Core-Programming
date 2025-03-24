import java.util.Scanner;
public class SubstringCompare{
	public static String stringChar(String string, int start, int end){
		String subtext="";
		for(int i=start; i<=end; i++)
			subtext+=string.charAt(i);
		return subtext;
	}
	public static String stringSubstring(String string, int start, int end){
		String subtext1=string.substring(start,end+1);
		return subtext1;
	}
	public static boolean compareResult(String subtext, String subtext1){
		if(subtext.length()!=subtext1.length())
			return false;
		for(int i=0; i<subtext.length(); i++){
			if(subtext.charAt(i)!=subtext1.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		System.out.print("Enter start index: ");
		int start=input.nextInt();
		System.out.print("Enter end index: ");
		int end=input.nextInt();		
		String subtext=stringChar(string, start, end);
		String subtext1=stringSubstring(string, start, end);
		boolean results=compareResult(subtext, subtext1);
		System.out.println("Substring using charAt(): "+subtext);
		System.out.println("Substring using substring(): "+subtext1);
		System.out.println(" Are the substrings equal? "+results);
	}
}
