import java.util.Scanner;
public class Calendar{
	private static final String[] months={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	private static final int[] daynumbers={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static boolean Leapyear(int year){
		return (year%4==0&&year%100!=0)||(year%400==0);
	}
	public static int getNumberOfDays(int month, int year){
		if(month==2&& Leapyear(year)){
			return 29;
		}
		return daynumbers[month-1];
	}
	public static int getFirstDayOfMonth(int month, int year){
		int d = 1; 
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int dayOfWeek = (d + x + (31 * m) / 12) % 7;
		return dayOfWeek;
	}
	public static void printCalendar(int month, int year) {
        System.out.println("\n      " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = getNumberOfDays(month, year);
        for(int i = 0; i < firstDay; i++) {
            System.out.print("    "); 
        }
        for(int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0 || day == totalDays) {
                System.out.println(); 
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        input.close();
        if(month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid month or year");
        } 
		else{
            printCalendar(month, year);
        }
    }
}