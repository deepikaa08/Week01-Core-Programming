import java.util.Scanner;
public class Arrayindexexception{
	public static void generateException(String[] names, int index){
		System.out.println("Accessing name at "+index);
		System.out.print("Name at "+index+" is "+names[index]);
	}
	public static void handlingException(String[] names, int index){
		try{
			System.out.println("Accessing name at "+index);
			System.out.print("Name at "+index+" is "+names[index]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception caught: "+e);
			System.out.println("Error, index number out of array length");
		}
		catch(RuntimeException e){
			System.out.println("Runtime error occured: "+e);
		}
	}
	public static void main(String[] args){
		String[] names={"AAA", "BBB", "CCC", "DDD"};
		Scanner input=new Scanner(System.in);
		System.out.print("Enter index of name: ");
		int index=input.nextInt();
		try{
			generateException(names, index);
		}
		catch(Exception e){
			System.out.println("Caught exception: "+e);
		}
		System.out.println("Handling exception");
		handlingException(names, index);
	}
}
