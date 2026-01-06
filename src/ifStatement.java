import java.util.Scanner;
public class ifStatement {
    public static void main(String[] args)
    {
        //if statement runs a block of code if the condition is true
        //lets see an example
        Scanner scanner = new Scanner(System.in);
        int x;
        int age;
        System.out.println("Enter a number to be checked");
        x= scanner.nextInt();

        if (x%2==0)
        {
            System.out.println("The given number is even");
        }
        else {
            System.out.println("The number is odd");
        }

        //if else-if and else
        System.out.println("Enter your age");
        age= scanner.nextInt();

        if (age>=60)
        {
            System.out.println("You are senior");
        } else if (age>=18) {
            System.out.println("You are an adult");

        } else if (age==0) {
            System.out.println("You are baby");

        }
        else {
            System.out.println("Invalid age");
        }


        scanner.close();
    }
}
