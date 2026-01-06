public class Arithmetic {
    //in this section we will learn about the different arithmetic operations

    public static void main(String[] args){
        int x =10;
        int y= 3;
        int z;

        System.out.println("Printing Using Normal Arithmetic Operations");
        //Addition
        z = x+y;
        System.out.println("The addition of x and y is: "+z);

        //subtraction
        z=x-y;
        System.out.println("The subtraction of x and y is: "+z);

        //multiplication
        z=x*y;
        System.out.println("Product of x and y is: "+z);

        //division
        z=x/y;
        System.out.println("Division of x and y is:"+z);

        //remainder
        z=x%y;
        System.out.println("Remainder of x /y is: "+z);


        System.out.println("Augmented Operations");

        //this is quite complex there is another method called augmented arithmetic operations without extra variable
        int a =10;
        int b=4;

        //addition
        a+=b;
        System.out.println("Sum is: "+a);

        //difference
        a-=b;
        System.out.println("Difference is: "+a);

        //product
        a*=b;
        System.out.println("Product is: "+a);

        //division
        a/=b;
        System.out.println("Quotient is: "+a);

        //remainder
        a%=b;
        System.out.println("Remainder is: "+a);


        //increment and decrement operators

        int k =5;
        k++;
        System.out.println(k);
        --k;
        k--;
        System.out.println(k);

        //order of mathematics operations is [P-E-M-D-A-S from left to right]
        double result = 2+6*8+9-4/2.0+(2-8);
        System.out.println(result);
    }
}
