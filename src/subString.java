public class subString {
    public static void main(String[] args)
    {
        String email = "gautamkiran878@gmail.com";
        String username = email.substring(0,14); //0 is start index and 14 is last index but not
        // included
        System.out.println(username);
        String domain = email.substring(15);
        System.out.println(domain);
    }
}
