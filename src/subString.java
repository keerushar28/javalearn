public class subString {
    public static void main(String[] args)
    {
        String email = "gautamkiran878@gmail.com";
        String username = email.substring(0,14); //0 is start index and 14 is last index but not
        // included
        System.out.println(username);
        String domain = email.substring(15);
        System.out.println(domain);
        //this could be useful for auto generating the username from the email
        //but this is manually assigning the number is not effective because email can be of
        // different length so we use indexOf method,
        String email1 = "bro@gmail.com";
        String username1 = email1.substring(0,email1.indexOf('@'));
        System.out.println(username1);
        String domain1 = email1.substring(email1.indexOf('@')+1);
        System.out.println(domain1);


    }
}
