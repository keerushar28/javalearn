import java.util.Scanner;

public class converter {

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double cm;
        double m;
        double km;
        int choice;

        //1= cm-----m
        //2= m --------cm
        //3= m------km
        //4 = km -----m
        System.out.println("Basic Converter App:");
        System.out.print("Enter 1 for cm->m\n2 for m->cm\n3 for m->km\n4 for km->m\n");
        System.out.print("Enter the choice: ");
        choice = scanner.nextInt();

        if (choice ==1)
        {
            System.out.print("Enter the length in cm: ");
            cm = scanner.nextDouble();
            m = cm / 100;
            System.out.printf("%.1f cm is equals to %.2f m",cm,m);
        } else if (choice==2) {
            System.out.print("Enter the length in m: ");
            m = scanner.nextDouble();
            cm = m*100;
            System.out.printf("%.1f m is equals to %.2f cm",m,cm);
        } else if (choice == 3) {
            System.out.print("Enter the length in m: ");
            m = scanner.nextDouble();
            km = m/1000;
            System.out.printf("%.1f m is equals to %.2f km",m,km);
        } else if (choice==4) {
            System.out.print("Enter the length in km: ");
            km = scanner.nextDouble();
            m = km*1000;
            System.out.printf("%.1f km is equals to %.2f m",km,m);
        }
        else {
            System.out.println("Please choose valid option: ");
        }


        scanner.close();
    }
}
