import java.util.Scanner;

public class CalendarProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        printCalendar(month, year);
    }
    
    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);
        
        System.out.printf("     %s %d\n", monthName, year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("   ");
        }
        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((firstDayOfMonth + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
    
    public static int getDaysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return days[month - 1];
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = 1;
        
        return (d + x + 31 * m / 12) % 7;
    }
}
