import java.util.Scanner;
public class ifStatement {
    public static void main(String[] args)
    {
        //if statement runs a block of code if the condition is true
        //lets see an example
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Enter a number to be checked");
        x= scanner.nextInt();

        if (x%2==0)
        {
            System.out.println("The given number is even");
        }
        else {
            System.out.println("The number is odd");
        }


        scanner.close();
    }
}
