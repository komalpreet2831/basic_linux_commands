import java.util.*;

class Springseason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
            return; 
        }

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();
      
        if (day < 1 || day > 31 || (month == 2 && day > 29) || (month == 4 && day > 30)) {
            System.out.println("Invalid day! Please enter a valid day for the given month.");
            return;
        }
        if ((month == 2 && day >= 12) || month == 3 || (month == 4 && day <= 11)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
    }
}

