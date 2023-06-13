import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling dice...");
        int i1 = (int) (Math.random() * 6) + 1;
        int i2 = (int) (Math.random() * 6) + 1;
        System.out.println("Die 1: " + i1);
        System.out.println("Die 2: " + i2);
        int sum = i1 + i2;
        System.out.println("Total value: " + sum);

        if (sum > 7)
            System.out.println(name + " won!");
        else
            System.out.println(name + " lost!");
    }

}
