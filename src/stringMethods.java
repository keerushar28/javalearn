public class stringMethods {
    public static void main(String[] args) {

        //length method
        String name = "Kiran Gautam";
        int len = name.length();
        System.out.println(len);

        //charAt is used to find the character at given index
        char letter = name.charAt(10);
        System.out.println(letter);

        //indexOf is used to find the index of the given char
        int index = name.indexOf('a');
        System.out.println(index);
        //lastIndex gives last index for repeated
        int lastIndex = name.lastIndexOf('a');
        System.out.println(lastIndex);

        //to convert to the uppercase
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);

        //to lowerCase
        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);
        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);
        String firstName = "Kiran";
        String lastName = "Gautam";
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);

        String uname = "Kiran4";
        String password = "Kiran";
        if (uname.equals(password)) {
            System.out.println("Password and uname cannot be same for security purpose");
        } else {
            System.out.println("Login Successful");
        }

        if (name.contains(" ")) {
            System.out.println("Contains space use trim method");
        }

        String afterTrim = name.trim();
        System.out.println(afterTrim);


    }
}
