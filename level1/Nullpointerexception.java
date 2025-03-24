import java.util.Scanner;
public class Nullpointerexception{
	public static void generateException(){
		String string=null;
		System.out.println("Length of string: "+string.length());
	}
	public static void handlingException(){
		String string=null;
		try{
			System.out.println("Length of string: "+string.length());
		}
		catch(NullPointerException e){
			System.out.println("Exception caught: "+e);
			System.out.println("Error, cannot call method on null value");
		}
	}
	public static void main(String[] args){
		System.out.println("Null exception handling demo");
		try{
			generateException();
		}
		catch(Exception e){
			System.out.println("Caught exception: "+e);
		}
		System.out.println("Handling the exception");
		handlingException();
	}
}
