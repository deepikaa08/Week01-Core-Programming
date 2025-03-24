import java.util.Scanner;
public class Stringindexoutofbounds{
	public static void generateException(String string){
		System.out.println("Character at index "+string.length()+" : "+string.charAt(string.length()));
	}
	public static void handlingException(String string){
		try{
			System.out.println("Character at index "+string.length()+" : "+string.charAt(string.length()));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception caught: "+e);
			System.out.println("Error, cannot access character out of index bound");
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter String: ");
		String string=input.nextLine();
		try{
			generateException(string);
		}
		catch(Exception e){
			System.out.println("Caught exception: "+e);
		}
		System.out.println("Handling the exception");
		handlingException(string);
	}
}

			