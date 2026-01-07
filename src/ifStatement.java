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
        scanner.nextLine();
        String name;
        System.out.print("Enter Your Name ");
        name = scanner.nextLine();
        System.out.println("Enter your age");
        age= scanner.nextInt();

        if (x%2==0)
        {
            System.out.println("The given number is even");
        }
        else {
            System.out.println("The number is odd");
        }

        //if else-if and else


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

        if (name.isEmpty()){
            System.out.println("You didn't enter your name !");
        }
        else {
            System.out.println("Hello Mr."+name);
        }

        //today's learning after reading the integer we should always use scanner.nextLine();




        scanner.close();
    }
}
