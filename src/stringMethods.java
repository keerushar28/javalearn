public class stringMethods {
    public static void main(String[] args){
        //length method
        String name  = "Kiran Gautam";
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



    }
}
