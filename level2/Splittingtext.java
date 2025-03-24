import java.util.Scanner;
public class Splittingtext{
	public static int textLength(String string){
		int length=0;
		try{
			while(true){
				string.charAt(length);
				length++;
			}
		}
		catch(IndexOutOfBoundsException e){
		}
		return length;
	}
	public static String[] findWords(String string){
		int length=textLength(string);
		int count=0;
		for(int i=0; i<length; i++){
			if(string.charAt(i)==' '){
				count++;
			}
		}
		int wordsCount= count+1;
		int spaceIndex[]=new int[count];
		int spaceidx=0;
		for(int i=0; i<length; i++){
			if(string.charAt(i)==' '){
				spaceIndex[spaceidx++]=i;
			}
		}
		String[] words=new String[wordsCount];
		int start=0;
		for(int i=0; i<count; i++){
			words[i]=string.substring(start, spaceIndex[i]);
			start=spaceIndex[i]+1;
		}
		words[wordsCount-1]=string.substring(start);
		return words;
	}
	public static boolean compareArrays(String[] arr1, String[] arr2){
		if(arr1.length!=arr2.length){
			return false;
		}
		for(int i=0; i<arr1.length; i++){
			if(!arr1[i].equals(arr2[i])){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		String[] customWords=findWords(string);
		String[] builtinWords=string.split(" ");
		System.out.println("Custom Split Output:");
        for (String word : customWords) {
            System.out.println(word);
        }
        System.out.println("\nBuilt-in Split Output:");
        for (String word : builtinWords) {
            System.out.println(word);
        }
        boolean isEqual = compareArrays(customWords, builtinWords);
        System.out.println("\nAre both outputs identical? " + isEqual);
    }
}