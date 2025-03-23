public class Football{
	public static int[] randomHeight(int size){
		int[] heights=new int[size];
		for(int i=0;i<size;i++){
			heights[i]=(int)(Math.random()*101)+150;
		}
		return heights;
	}
	public static int sum(int[] heights){
		int sum=0;
		for(int i=0; i<heights.length; i++){
			sum+=heights[i];
		}
		return sum;
	}
	public static int mean(int sum){
		int average=sum/11;
		return average;
	}
	public static int min(int[] heights){
		int shortest=heights[0];
		for(int i=0; i<heights.length; i++){
			shortest=Math.min(shortest,heights[i]);
		}
		return shortest;
	}
	public static int max(int[] heights){
		int tallest=heights[0];
		for(int i=0; i<heights.length; i++){
			tallest=Math.max(tallest, heights[i]);
		}
		return tallest;
	}
	public static void main(String[] args){
		int size=11;
		int randomarray[]=randomHeight(size);
		System.out.println("The heights are: ");
		for(int i=0; i<11; i++){
			System.out.print(randomarray[i]+" ");
		}
		System.out.println();
		int sumOfHeights=sum(randomarray);
		System.out.println("The sum of heights is: "+sumOfHeights);
		int averageHeight=mean(sumOfHeights);
		System.out.println("Average height of team: "+averageHeight);
		int shortestPlayer=min(randomarray);
		System.out.println("The shortest palyer is: "+shortestPlayer);
		int tallestPlayer=max(randomarray);
		System.out.println("The tallest player is: "+tallestPlayer);
	}
}

		