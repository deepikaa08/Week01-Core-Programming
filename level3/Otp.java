public class Otp{
	public static int[] otpGenerate(int size){
		int array[]=new int[size];
		for(int i=0; i<size; i++){
			array[i]=(int)(Math.random()*900000)+100000;
		}
		return array;
	}
	public static boolean uniqueOtp(int[] array){
		for(int i=0; i<array.length; i++){
			for(int j=i+1; j<array.length; j++){
				if(array[i]==array[j])
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		int size=10;
		int result[]=otpGenerate(size);
		System.out.println("The generated otps are: ");
		for(int i=0; i<result.length; i++)
			System.out.println(result[i]);
		boolean unique= uniqueOtp(result);
		System.out.println("Are the otps unique? "+unique);
	}
}
