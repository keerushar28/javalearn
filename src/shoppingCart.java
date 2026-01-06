import java.util.Scanner;
public class shoppingCart {
    public static void main(String[] args){
        float basePrice = 1500;
        char currency = '$';
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of tickets you want: ");
        int tickets = scanner.nextInt();
        float totalPrice = tickets * basePrice;

        System.out.println("Thank you Mr."+name+" for booking "+tickets+" tickets. Your total is "+currency+totalPrice);

        System.out.println();
        scanner.close();
    }
}
