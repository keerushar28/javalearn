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

        String name = "Kiran";
        System.out.printf("Hi Mr %s\n", name);


        double salary = 500.52;
        double temperature = 25.32;

        System.out.println("The salary of employee at company is "+salary);


        char grade = 'A';
        char currency = '$';
        System.out.println("You get an "+grade +" grade in Nepali");



    }

}
