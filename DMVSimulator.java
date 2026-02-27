import java.util.Random;

public class DMVSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Weclome to the DMV");

        int userNum = rand.nextInt(100) + 1;

        System.out.println("Your number is " + userNum);
        System.out.println("Please wait until your number is called");

        int currentNum = userNum + 1;

        if (currentNum > 100) {
            currentNum = 1;
        }

        while (currentNum != userNum) {
            System.out.println("Number " + currentNum);
            currentNum += 1;

            if (currentNum > 100) {
                currentNum = 1;
            }
        }

        System.out.println("Number  " + userNum + " please come up to the desk");
        System.out.println("Sorry you do not have the required paperwork");
    }
}
