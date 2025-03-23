import java.util.Scanner;
public class Calendar{
    public static String getMonth(int month){
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[month-1]; 
    }
	public static boolean isLeapYear(int year) { 
        return((year%4==0&&year%100!=0)||(year%400==0));
    }
    public static int getDaysInMonth(int month, int year) { 
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2&&isLeapYear(year)) 
			return 29;
        return days[month-1];
    }
    public static int getFirstDay(int m,int y) { 
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(1+x+31*m0/12)%7;
        return d0;
    }
    public static void printCalendar(int month,int year) {
        System.out.println("\n"+getMonth(month)+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int days=getDaysInMonth(month,year);
        int firstDay=getFirstDay(month,year);
        for(int i=0;i<firstDay;i++) 
            System.out.print("    ");
        for(int day=1;day<=days;day++) {
            System.out.printf("%3d ",day);
            if ((firstDay+day)%7==0) 
                System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter month (1-12):");
        int month=scanner.nextInt();
		scanner.nextLine();
        System.out.print("Enter year:");
        int year=scanner.nextInt();
		scanner.nextLine();
		scanner.close();
        printCalendar(month,year);
    }
}