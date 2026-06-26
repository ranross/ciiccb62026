public class Task8 {

    public static int sumNumbers(int... numbers) {
        int total = 0;

        for (int num : numbers) {
            int cumulative = 0;

            // Compute the sum from 1 up to the current number
            for (int i = 1; i <= num; i++) {
                cumulative += i;
            }

            System.out.println(num + " = " + cumulative);
            total += cumulative;
        }

        return total;
    }

    public static void main(String[] args) {

        int total = sumNumbers(4, 5, 10);

        System.out.println("Total Sum = " + total);
    }
}