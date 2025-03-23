import java.util.Scanner;
public class Euclidean{
	public static double distance(int x1, int y1, int x2, int y2){
		double firstTerm=(double)(Math.pow((x2-x1),2));
		double secondTerm=(double)(Math.pow((y2-y1),2));
		double edistance=Math.sqrt(firstTerm+secondTerm);
		return edistance;
	}
	public static double[] equation(int x1, int y1, int x2, int y2){
		double m=(double)(y2-y1)/(x2-x1);
		double b=y1-m*x1;
		return new double[]{m,b};
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter x1 value: ");
		int x1=input.nextInt();
		System.out.print("Enter y1 value: ");
		int y1=input.nextInt();
		System.out.print("Enter x2 value: ");
		int x2=input.nextInt();
		System.out.print("Enter y2 value: ");
		int y2=input.nextInt();
		double euclideanDistance=distance(x1,y1,x2,y2);
		System.out.println("The euclidean distance between("+x1+","+y1+") and ("+x2+","+y2+") is "+euclideanDistance);
		double slope[]=equation(x1,y1,x2,y2);
		System.out.println("The equation of line is "+slope[0]+"*x +"+slope[1]);
	}
}

		