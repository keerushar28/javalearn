public class datatypes {
    //in this program we will learn about the different datatypes and variables in java
    //variables are used to store data like x=5
    //there are basically 2 data types
    //1. primitive data types uses stack
    //2. non-primitive data types uses heap memory
    //primitive is like storing data directly like int float char boolean
    //non primitive is like storing memory address of data like arrays strings objects that points to heap

    public static void main(String [] args){
        int age = 25; //this is integer data type
        System.out.printf("You are %d years old\n", age);

        double salary = 500.52;
        double temperature = 25.32;

        System.out.println("The salary of employee at company is "+salary);
        System.out.println("Current temperature is "+temperature);


        char grade = 'A';
        char currency = '$';
        System.out.println("You get an "+grade +" grade in Nepali but the currency is "+currency +"haha that's sounds funny");


        boolean isOnline = true;
        boolean isStudent = false;
        boolean isTeacher = true;

        System.out.println("Is he a teacher answer is: "+ isTeacher);
        if (!isStudent){
            System.out.println("Sorry you are not eligible");
        }
        else {
            System.out.println("You are eligible for Github Education Pack");
        }

        if(!isOnline){
            System.out.println("You cannot do video call");
        }
        else {
            System.out.println("You can do video call enjoy");
        }


        char a = 65;
        System.out.println("the value of a is: "+a);

        //this is end of the primitive data types now learn about reference
        String fullName = "Kiran Gautam";
        String email = "Kiran@123";
        String car = "Mustang";

        System.out.println("Mr: "+fullName+ " with the email "+ email +" buys a car "+ car);

        //this is the end of the variables and unit 3 we will be back soon on unit 3






    }

}
