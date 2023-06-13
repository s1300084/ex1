public class DiceGame {
    public static void main(String[] args) {

        System.out.println("Rolling dice...");
        int i1 = (int) (Math.random() * 6) + 1;
        int i2 = (int) (Math.random() * 6) + 1;
        System.out.println("Die 1: " + i1);
        System.out.println("Die 2: " + i2);
        int sum = i1 + i2;
        System.out.println("Total value: " + sum);
    }

}
