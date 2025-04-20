public class Earth {
	public static void main(String[] args) {
		int radius=6378;
		double mile=radius*0.621371;
		double volumeKm=((double)4/3)*3.14*radius*radius*radius;
		double volumeMile=((double)4/3)*3.14*mile*mile*mile;
		System.out.println("The volume of earth in cubic kilometers is "+volumeKm+" and cubic miles is "+volumeMile);
	}
}

