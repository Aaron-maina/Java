//Number 4
public class MultiplesFinder {
    public static void main(String[] args) {
        // Define the range
        int start = 71;
        int end = 150;

        // Print multiples of 2
        System.out.println("Multiples of 2 within the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Print multiples of 3
        System.out.println("Multiples of 3 within the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Print multiples of 7
        System.out.println("Multiples of 7 within the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
