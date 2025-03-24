import java.util.Scanner;
public class Freqnestedloop{
	public static String[] findFrequency(String string){
		char[] charArray=string.toCharArray();
		int[] frequency=new int [charArray.length];
		int length=charArray.length;
		for(int i=0; i<length; i++){
			if(charArray[i]=='0'|| charArray[i]==' '){
				continue;
			}
			frequency[i]=1;
			for(int j=i+1; j<length; j++){
				if(charArray[i]==charArray[j]){
					frequency[i]++;
					charArray[j]='0';
				}
			}
		}
		int uniqueCount=0;
		for(char c: charArray){
			if(c!='0'&&c!=' '){
				uniqueCount++;
			}
		}
		String[] result = new String[uniqueCount];
		int index=0;
		for(int i=0; i<length; i++){
			if(charArray[i] !='0' &&charArray[i]!=' '){
				result[index++]=charArray[i]+" : "+frequency[i];
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		String[] frequencyArray= findFrequency(string);
		System.out.println("Character frequency: ");
		for(String row : frequencyArray){
			System.out.println(row);
		}
	}
}
