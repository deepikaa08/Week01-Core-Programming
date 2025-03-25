import java.util.Scanner;
public class Frequency{
	public static char character(String string){
		char frequent=' ';
		int maxcount=0;
		for(int j=0; j<string.length(); j++){
			int count=0;
			for(int i=0; i<string.length(); i++){
				if(string.charAt(i)==string.charAt(j)){
					count++;
				}
			}
			if(count>maxcount){
				maxcount=count;
				frequent=string.charAt(j);
			}
		}
		return frequent;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		char result=character(string);
		System.out.println("Frequent character: "+result);
	}
}
