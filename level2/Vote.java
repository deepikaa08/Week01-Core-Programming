public class Vote{
	public static int[] ages(int size){
		int[] ages=new int[size];
		for(int i=0; i<size; i++){
			ages[i]=(int)(Math.random()*99)+1;
		}
		return ages;
	}
	public static Object[][] checkAge(int[] ages){
		Object result[][]=new Object[ages.length][2];
		for(int i=0; i< ages.length; i++){
			result[i][0]=ages[i];
			if(ages[i]>=18){
				result[i][1]= true;
			}
			else{
				result[i][1]= false;
			}
		}
		return result;
	}
	public static void displayResults(Object[][] result){
		System.out.println("\nAge | Can Vote?");
        System.out.println("----------------");
        for (Object[] row : result) {
            System.out.printf("%3d  | %s\n", row[0], row[1]);
        }
    }
	public static void main(String[] args){
		int size=10;
		int[] studentAges=ages(size);
		Object[][] eligibility=checkAge(studentAges);
		displayResults(eligibility);
	}
}

