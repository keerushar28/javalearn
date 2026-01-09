import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        double time;
        double timesCompounded;
        double amount;
        System.out.print("Enter the Principal Amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the Interest rate in % ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the # of years: ");
        time = scanner.nextDouble();
        System.out.print("Enter the # of compounded: ");
        timesCompounded = scanner.nextDouble();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * time);

        System.out.printf("The amount after compound interest is $%.2f",amount);





        scanner.close();
    }
}
