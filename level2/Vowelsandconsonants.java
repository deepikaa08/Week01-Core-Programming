import java.util.Scanner;
public class Vowelsandconsonants{
	public static int[] checkcharacters(String text){
		String string=text.toLowerCase();
		int vowels=0, consonants=0;
		char[] chararray=string.toCharArray();
		for(int i=0; i<chararray.length; i++){
			if(chararray[i]=='a'||chararray[i]=='e'||chararray[i]=='i'||chararray[i]=='o'||chararray[i]=='u'){
				vowels++;
			}
			else
				consonants++;
		}
		return new int[]{vowels, consonants};
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String text=input.nextLine();
		int[] result=checkcharacters(text);
		System.out.println("The number of vowels is :"+result[0]);
		System.out.println("The number of consonants is :"+result[1]);
	}
}
