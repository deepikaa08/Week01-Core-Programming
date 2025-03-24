import java.util.Scanner;
public class Illegalargument{
	public static void generateException(String string, int start, int end){
		System.out.println("Substring: "+string.substring(start,end));
	}
	public static void handlingException(String string, int start, int end){
		try{
			System.out.println("Substring: "+string.substring(start,end));
		}
		catch(IllegalArgumentException e){
			System.out.println("Exception caught: "+e);
			System.out.println("Error, start index greater than end index");
		}
		catch(RuntimeException e){
			System.out.println("Runtime exception occured: "+e);
		}
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		System.out.print("Enter start index: ");
		int start=input.nextInt();
		System.out.print("Enter end index: ");
		int end=input.nextInt();
		try{
			generateException(string, start, end);
		}
		catch(Exception e){
			System.out.println("Caught exception: "+e);
		}
		System.out.println("Handling exception:");
		handlingException(string, start, end);
	}
}

		