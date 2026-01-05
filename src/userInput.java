import  java.util.Scanner;
public class userInput {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine();

    //string, int, double, float
        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        System.out.print("Enter your gpa:");
        float gpa = scanner.nextFloat();
        System.out.print("Enter your salary:");
        double salary = scanner.nextDouble();

        String grade;
        if (gpa >=3.65 && gpa<=4.0)
        {
             grade = "A+";
        } else if (gpa >=3.00 && gpa<3.65) {
             grade = "A";
        } else if (gpa>=2.00 && gpa<3.00) {
             grade = "B";
        } else {
             grade = "NG";
        }
        System.out.print("Are you a student (true/false):");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Hello Mr."+name+ " you are "+age+" years old, your salary is "+salary+" and your grade is "+grade);
        if (isStudent)
        {
            System.out.println("You are eligible for the education pack");
        }
        else {
            System.out.println("Sorry you are not eligible for the github education pack");
        }

        scanner.close();
    }
}
