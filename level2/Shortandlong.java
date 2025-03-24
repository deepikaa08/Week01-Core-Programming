import java.util.Scanner;
public class Shortandlong{
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
	 public static String[][] wordLengthArray(String[] words){
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];  
            result[i][1] = String.valueOf(textLength(words[i])); 
		}
        return result;
    }
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		String[] customWords=findWords(string);
		String[][] wordTable=wordLengthArray(customWords);
		System.out.println("\nWord\tLength");
		System.out.println("----------------");
		String longestWord = "";
        String shortestWord = customWords[0];  
        int maxLength = 0;
        int minLength = textLength(shortestWord);

        for (String[] row : wordTable) {
            int wordLength = Integer.parseInt(row[1]);
            System.out.println(row[0] + "\t" + wordLength);

            if (wordLength > maxLength) {
                maxLength = wordLength;
                longestWord = row[0];
            }
            if (wordLength < minLength) {
                minLength = wordLength;
                shortestWord = row[0];
            }
        }
        System.out.println("\nThe longest word is: " + longestWord);
        System.out.println("The shortest word is: " + shortestWord);
    }
}