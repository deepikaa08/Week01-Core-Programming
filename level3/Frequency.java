import java.util.Scanner;
public class Frequency{
	public static char[][] charFrequency(String string){
		int[] charFreq=new int[256];
		for(int i=0; i<string.length();i++){
			char currentChar=string.charAt(i);
			charFreq[currentChar]++;
		}
		int uniqueCount=0;
		for(int i=0; i<256; i++){
			if(charFreq[i]>0){
				uniqueCount++;
			}
		}
		char[][] result = new char[uniqueCount][2];
		int index=0;
		for(int i=0; i<256; i++){
			if(charFreq[i]>0){
				result[index][0]=(char)i;
				result[index][1]=(char)charFreq[i];
				index++;
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string= input.nextLine();
		char[][] frequencyArray=charFrequency(string);
		System.out.println("Character frequency: ");
		for(char[] pair : frequencyArray){
			System.out.println(pair[0]+" -> "+(int)pair[1]);
		}
	}
}
