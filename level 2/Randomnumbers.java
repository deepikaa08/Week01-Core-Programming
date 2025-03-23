public class Randomnumbers{
	public static int[] randomarray(int size){
		int number[]=new int[size];
		for(int i=0;i<size;i++){
			number[i]=(int)(Math.random()*9000)+1000;
		}
		return number;
	}
	public static double[] averageminmax(int[] number){
		int min=number[0], max= number[0], sum=0;
		for(int i=0;i<number.length;i++){
			sum+=number[i];
			min=Math.min(min, number[i]);
			max=Math.max(max, number[i]);
		}
		double average=(double) sum/number.length;
		return new double[]{average, min, max};
	}
	public static void main(String[] args){
		int size=5;
		int randomnumber[]=randomarray(size);
		System.out.print("The numbers are: ");
		for(int i=0;i<5;i++){
			System.out.print(randomnumber[i]+" ");
		}
		System.out.println();
		double[] stats= averageminmax(randomnumber);
		System.out.print("Average: "+stats[0]);
		System.out.print("\nMinimum number: "+stats[1]);
		System.out.print("\nMaximum number: "+stats[2]);
	}
}

			
