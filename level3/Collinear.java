import java.util.Scanner;
public class Collinear{
	public static boolean slopeFormula(int x1, int y1, int x2, int y2, int x3, int y3){
		double slope1=(double)(y2-y1)/(x2-x1);
		double slope2=(double)(y3-y2)/(x3-x2);
		double slope3=(double)(y3-y1)/(x3-x1);
		return slope1==slope2&&slope2==slope3;
	}
	public static boolean triangleFormula(int x1, int y1, int x2, int y2, int x3, int y3){
		double area=(double)0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
		return area==0;
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
		System.out.print("Enter x3 value: ");
		int x3=input.nextInt();
		System.out.print("Enter y3 value: ");
		int y3=input.nextInt();
		boolean collinearslope=slopeFormula(x1,y1,x2,y2,x3,y3);
		boolean collineartriangle=triangleFormula(x1,y1,x2,y2,x3,y3);
		System.out.println("Are the points collinear using slope formula?"+collinearslope);
		System.out.println("Are the points collinear using triangle formula?"+collineartriangle);
	}
}
