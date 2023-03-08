import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your hourly wage? ");
        double wage = input.nextDouble();

        System.out.println("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        double regularPay = hoursWorked * wage;
        double overTimepay = (hoursWorked-40)*(wage*1.5);
        double totalPayWhenOvertimeWeek = regularPay + overTimepay;

        if(hoursWorked > 40){

            System.out.printf("Your salary for this week is: %f%n", totalPayWhenOvertimeWeek );
            System.out.printf("Your salary for this month, if you continue selling the same amount for this month, is: %f%n", totalPayWhenOvertimeWeek*4);
        } else{
            System.out.printf("Your Salary for this week is: %f%n", regularPay);
            System.out.printf("Your Salary for this month, if you continue selling the same amount for this month, is: %f%n", regularPay*4);
        }
    }
}