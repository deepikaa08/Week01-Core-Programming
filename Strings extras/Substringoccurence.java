import java.util.Scanner;
public class Substringoccurence{
	public static int subcount(String string , String sub){
		int count=0;
		int stringLength=string.length();
		int substringLength=sub.length();
		for(int i=0; i<=stringLength-substringLength; i++){
			boolean match=true;
			for(int j=0; j<substringLength; j++){
				if(string.charAt(i+j)!=sub.charAt(j)){
					match=false;
					break;
				}
			}
			if(match){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		System.out.print("Enter substring: ");
		String sub=input.nextLine();
		int result=subcount(string, sub);
		System.out.println("The number of times the substring occurs is: "+result);
	}
}