import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int target = (int) (Math.random() * 10);

        Player nikita = new Player();

        System.out.print("Let me know your name: ");
        String name = sc.nextLine();
        System.out.print("Try to guess the number (0..9): ");
        int num = (int) (sc.nextInt());

        if (num >= 0 && num <= 9) {
            nikita.setName(name);
            nikita.setNum(num);
            nikita.setNumOfAttempts();

            if (nikita.getNum() == target) {
                System.out.println("You won! target val was = " + nikita.getNum());
            } else {
                while (nikita.getNum() != target) {
                    System.out.println("Not enough... " + nikita.getNum() + " is wrong.");
                    nikita.setNum((int) (sc.nextInt()));
                    nikita.setNumOfAttempts();
                }
                System.out.println("You won! target val was = " + nikita.getNum());
                System.out.println("Count of tries: " + nikita.getNumOfAttempts());
            }
        }
        else {
            System.out.println("Wrong parameters... CRITICAL ERROR");
        }
    }
}
