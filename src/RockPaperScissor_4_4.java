import java.util.Random;

public class RockPaperScissor_4_4 {

    public static void main(String[] args) {
        Random numb = new Random();
        int rps = numb.nextInt(3);
        if (rps == 0) {
            System.out.println("rock");
        } else if (rps == 1) {
            System.out.println("paper");
        } else if (rps == 2) {
            System.out.println("scissors");
        }
    }
}
