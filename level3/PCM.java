import java.util.Scanner;
public class PCM{
	public static int[][] subjectScores(int number){
		int marks[][]=new int[number][3];
		for(int i=0; i<number; i++){
			marks[i][0]=(int)(Math.random()*90)+10;
			marks[i][1]=(int)(Math.random()*90)+10;
			marks[i][2]=(int)(Math.random()*90)+10;
		}
		return marks;
	}
	public static double[][] scoreStatus(int[][] marks){
		double stats[][]=new double[marks.length][3];
		for(int i=0; i<marks.length; i++){
			int total=marks[i][0]+marks[i][1]+marks[i][2];
			double average=total/3;
			double percent=(total/300)*100;
			stats[i][0]=total;
			stats[i][1]=Math.round(average*100)/100;
			stats[i][2]=Math.round(percent*100)/100;
		}
		return stats;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number=input.nextInt();
		int studentMarks[][]=subjectScores(number);
		double studentStats[][]=scoreStatus(studentMarks);
		System.out.println("\nStudent Scorecard");
        System.out.println("---------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println((i + 1) + "\t" + studentMarks[i][0] + "\t" + studentMarks[i][1] + "\t" + studentMarks[i][2] + "\t" +
                               (int) studentStats[i][0] + "\t" + studentStats[i][1] + "\t" + studentStats[i][2] + "%");
        }
	}
}
