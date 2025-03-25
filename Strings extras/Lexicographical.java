import java.util.Scanner;
public class Lexicographical{
	public static String[] order(String string1, String string2){
		String s1=string1.toLowerCase();
		String s2=string2.toLowerCase();
		String[] words=new String[2];
		for(int i=0; i<string1.length(); i++){
			char char1=s1.charAt(i);
			char char2=s2.charAt(i);
			if(char1>='a'&&char2>'a'){
				words[0]=s1;
				words[1]=s2;
			}
			else if(char2>='a'&&char1>'a'){
				words[0]=s2;
				words[1]=s1;
			}
		}
		return words;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String string1=input.nextLine();
		System.out.print("Enter string 2: ");
		String string2=input.nextLine();
		String[] result=order(string1, string2);
		System.out.println(result[0]+" comes before "+result[1]+" in lexicographical order");
	}
}
