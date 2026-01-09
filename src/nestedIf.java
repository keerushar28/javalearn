public class nestedIf {
    public static void main(String[] args) {
        //nested if statements
        //0=false 1=true
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 10.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get an senior discount of 20%");
                System.out.println("You get an student discount of 10%");
                price *= 0.7;
            } else {
                System.out.println("You get an student discount of 10%");
                price *= 0.9;
            }

        } else {
            if (isSenior) {
                System.out.println("You get and senior discount of 20%");
                price *= 0.8;
            } else {
                price *= 1;
            }

        }

        System.out.printf("The ticket of price is %.2f", price);
    }
}
