import java.util.Random;
public class randomNum {
    public static void main(String[] args) {
        Random random = new Random();
        //it is useful in case of the OTP
        int x;
        x = random.nextInt(1000, 10001);
        System.out.println(x);


        boolean isHead;
        isHead = random.nextBoolean();
        if (isHead) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

    }
}
