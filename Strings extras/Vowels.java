import java.util.Scanner;
public class Vowels{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		char[] chars=new char[string.length()];
		string=string.toLowerCase();
		int vowels=0, consonants=0;
		char[] chararray=string.toCharArray();
		for(int i=0; i<chararray.length; i++){
			if(chararray[i]=='a'||chararray[i]=='e'||chararray[i]=='i'||chararray[i]=='o'||chararray[i]=='u'){
				vowels++;
			}
			else
				consonants++;
		}
		System.out.println("Number of vowels: "+vowels);
		System.out.println("Number of constants: "+consonants);
	}
}
