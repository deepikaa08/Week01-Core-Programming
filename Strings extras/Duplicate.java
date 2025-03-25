import java.util.Scanner;
public class Duplicate{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		StringBuilder result= new StringBuilder();
		for(int i=0; i<string.length(); i++){
			int count=0;
			for(int j=0; j<result.length(); j++){
				if(string.charAt(i)==result.charAt(j)){
					count++;
				    break;
				}
			}
			if(count==0)
				result.append(string.charAt(i));
		}
		System.out.println("String without duplicates: "+result);
	}
}
