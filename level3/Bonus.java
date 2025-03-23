public class Bonus{
	public static void main(String[] args){
		int employee=10;
		int[][]employeeData=new int[employee][2];
		double[][]bonusData=new double[employee][2];
		for(int i=0; i<employee; i++){
			employeeData[i][0]=(int)(Math.random()*90000)+10000;
			employeeData[i][1]=(int)(Math.random()*10)+1;
		}
		for(int i=0; i<employee;i++){
			double bonusPercent=(employeeData[i][1]>5)?0.05:0.02;
			double bonusAmount=employeeData[i][0]*bonusPercent;
			double newSalary=employeeData[i][0]+bonusAmount;
			bonusData[i][0]=bonusAmount;
			bonusData[i][1]=newSalary;
		}
		System.out.println("------------------------------------------------------------");
		System.out.printf("%-5s %-10s %-15s %-10s %-10s\n", "ID", "Salary", "Years of Service", "Bonus", "New Salary");
		System.out.println("------------------------------------------------------------");
		double totalSalary=0, totalBonus=0, totalNewsalary=0;
		for(int i=0; i<employee; i++){
			totalSalary+=employeeData[i][0];
			totalBonus+=bonusData[i][0];
			totalNewsalary+=bonusData[i][1];
			System.out.printf("%-5d %-10d %-15d %-10.2f %-10.2f\n", 
                i + 1, employeeData[i][0], employeeData[i][1], bonusData[i][0], bonusData[i][1]);
        }
		System.out.println("------------------------------------------------------------");
        System.out.printf("Total  %-9.2f %-15s %-9.2f %-9.2f\n",totalSalary, "", totalBonus, totalNewsalary);
	}
}
