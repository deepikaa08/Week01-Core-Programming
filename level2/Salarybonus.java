import java.util.Scanner;
public class Salarybonus{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double salary[]=new double[10];
		double year[]=new double[10];
		for(int i=0; i<10;i++){
			System.out.println("Enter employee "+(i+1)+" details: ");
			while(true){
				System.out.print("Enter salary: ");
				salary[i]=input.nextDouble();
				System.out.print("enter years of service: ");
				year[i]=input.nextDouble();
				if(salary[i]>=0&&year[i]>=0)
					break;
				else
					System.out.print("Enter valid number");
			}
		}
		double newSalary[]=new double[10];
		double bonus[]= new double[10];
		double totalBonus=0, totalNewsalary=0, totalSalary=0;
		for(int i=0;i<10;i++){
			if(year[i]>5){
				bonus[i]=salary[i]*0.05;
			}
			else
				bonus[i]=salary[i]*0.02;
			newSalary[i]=bonus[i]+salary[i];
			totalBonus+=bonus[i];
			totalNewsalary+=newSalary[i];
			totalSalary+=salary[i];
		}
		input.close();
		System.out.println("The employee details are: ");
		for(int i=0;i<10;i++){
			System.out.println("Employee "+(i+1)+"'s old salary is "+salary[i]+", bonus is "+bonus[i]+" and the new salary is "+newSalary[i]);
		}
		System.out.println("The total salary is "+totalSalary);
		System.out.println("The total bonus is "+totalBonus);
		System.out.println("The total new salary is "+totalNewsalary);
	}
}
