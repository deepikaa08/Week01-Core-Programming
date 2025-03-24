import java.util.Scanner;
public class CompareStrings{
	public static boolean compareChar(String string1, String string2){
		if(string1.length()!=string2.length())
			return false;
		for(int i=0; i<string1.length(); i++){
			if(string1.charAt(i)!=string2.charAt(i))
				return false;
		}
		return true;
	}
	public static boolean compareEqual(String string1, String string2){
		if(string1.equals(string2)){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first string: ");
		String string1=input.nextLine();
		System.out.print("Enter second string: ");
		String string2=input.nextLine();
		boolean compareCharat=compareChar(string1,string2);
		boolean compareEquals=compareEqual(string1, string2);
		System.out.println("Are the strings equal (using charAt)?: "+compareCharat);
		System.out.println("Are the strings equal (using equals)?: "+compareEquals);
		if(compareCharat==compareEquals)
			System.out.println("Both methods give the same result");
		else
			System.out.println("Each method gives different result");
		input.close();
	}
}

		
		