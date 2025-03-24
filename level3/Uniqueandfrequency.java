import java.util.Scanner;
public class Uniqueandfrequency{
	public static char[] uniqueChar(String string){
		String unique="";
		for(int i=0; i<string.length(); i++){
			char ch=string.charAt(i);
			if(ch!=' '&& unique.indexOf(ch)==-1){
				unique+=ch;
			}
		}
		return unique.toCharArray();
	}
	public static String[][] findFrequency(String string){
		int[] frequency=new int[256];
		for(int i=0; i<string.length(); i++){
			char ch =string.charAt(i);
			if(ch!= ' '){
				frequency[ch]++;
			}
		}
		char[] uniqueChars= uniqueChar(string);
		String[][] result=new String[uniqueChars.length][2];
		for(int i=0; i<uniqueChars.length; i++){
			result[i][0]=String.valueOf(uniqueChars[i]);
			result[i][1]=String.valueOf(frequency[uniqueChars[i]]);
		}
		return result;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		String[][] freqArray = findFrequency(string);
		System.out.println("Character Frequency: ");
		for(String [] row: freqArray){
			System.out.println(row[0]+" : "+row[1]);
		}
	}
}
