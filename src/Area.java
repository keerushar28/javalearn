import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        double length = 0;
        double breadth = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        length = scanner.nextDouble();
        System.out.print("Enter the breadth of rectangle:");
        breadth = scanner.nextDouble();
        area = length*breadth;
        System.out.println("Area is "+area +"cm^2");




        scanner.close();

    }
}
