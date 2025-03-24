import java.util.Scanner;
public class Numberformat{
	public static void generateException(String string){
		System.out.println("The number from text is: "+Integer.parseInt(string));
	}
	public static void handlingException(String string){
		try{
			System.out.println("The number from text is: "+Integer.parseInt(string));
		}
		catch(NumberFormatException e){
			System.out.println("Exception caught: "+e);
			System.out.println("Error, no number found in string");
		}
		catch(RuntimeException e){
			System.out.println("Runtime exception occured: "+e);
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		try{
			generateException(string);
		}
		catch(Exception e){
			System.out.println("Caught exception: "+e);
		}
		System.out.println("Handling exception: ");
		handlingException(string);
	}
}
