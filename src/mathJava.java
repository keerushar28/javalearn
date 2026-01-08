import java.util.Scanner;
public class mathJava {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //some other concept related to math class in java
        double result;
        result = Math.abs(-5);
        System.out.println(result);
        result = Math.max(10,20);
        System.out.println(result);
        result = Math.min(10,20);
        System.out.println(result);
        result = Math.pow(2,3); //base,power
        System.out.println(result);
        result = Math.sqrt(81);
        System.out.println(result);
        result = Math.round(5.25);
        System.out.println(result);
        result = Math.ceil(3.365);
        System.out.println(result);
        result = Math.floor(3.365);
        System.out.println(result);


        //Pythagoras theorem
        double h;
        double p;
        double b;
        System.out.println("Enter the perpendicular");
        p=scanner.nextDouble();

        System.out.println("Enter the base");
        b= scanner.nextDouble();


        h=Math.sqrt(Math.pow(p,2)+Math.pow(b,2));
        System.out.println(h);






    }
}
