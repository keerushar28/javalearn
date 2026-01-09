public class printf {
    public static void main(String[] args)
    {
        String name = "Kiran";
        char firstLetter = 'K';
        boolean isTeacher =false;
        int age = 12;
        double salary = 250.00;

        //learning the printf
        //%d for int
        //%s for string
        //%b for boolean
        //%f for float double
        //%c for char
        System.out.printf("Hello Mr %s. You first letter is %c. You are %d years old and you earn" +
                " %f Per month\n",name,firstLetter,age,salary);

        System.out.printf("Are you teacher? Answer is %b\n",isTeacher);

        //precision in java  add after %sign %paxi jati kun number rakhne vanda jatai chainxa
        // teti like if you need 2 after decimal .2 and soon
        double a=5.023;
        double b= 360.62;
        double c = -3663.35;
        System.out.printf("%.2f\n",a);
        System.out.printf("%.2f\n",b);
        System.out.printf("%.2f\n",c);




    }
}
