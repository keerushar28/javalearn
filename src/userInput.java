import  java.util.Scanner;
public class userInput {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String fname = scanner.nextLine();
        String  name =   fname.toUpperCase();
        System.out.println("Hi Mr."+ name);

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
        System.out.println("Hello Mr."+name+ " you are "+age+" years old, your salary is "+salary+" and your grade is "+grade);


        scanner.close();
    }
}
