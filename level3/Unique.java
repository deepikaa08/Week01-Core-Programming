import java.util.Scanner;
public class Unique{
	public static int findLength(String string){
		int count=0;
		try{
			while(true){
				string.charAt(count);
				count++;
			}
		}
		catch(IndexOutOfBoundsException e){
			return count;
		}
	}
	public static char[] uniqueChar(String string){
		int len = findLength(string);
		char[] uniqueCh=new char[len];
		int uniqueCount=0;
		for(int i=0; i<len ; i++){
			char currentCh=string.charAt(i);
			boolean isUnique=true;
			for(int j=0; j<uniqueCount; j++){
				if (uniqueCh[j]==currentCh){
					isUnique=false;
					break;
				}
			}
			if(isUnique){
				uniqueCh[uniqueCount]=currentCh;
				uniqueCount++;
			}
		}
		char[] result = new char[uniqueCount];
		for(int i=0; i<uniqueCount; i++){
			result[i]=uniqueCh[i];
		}
		return result;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		char[] uniqueCharacters= uniqueChar(string);
		System.out.print("Unique characters: ");
		for(char c : uniqueCharacters){
			System.out.print(c+" ");
		}
	}
}
