public class PythagoreanTriplet {
    // Function to check if a, b, c form a Pythagorean triplet
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Find the largest number
        int max = Math.max(a, Math.max(b, c));
        int x, y;

        // Assign x and y to the other two numbers
        if (max == a) {
            x = b;
            y = c;
        } else if (max == b) {
            x = a;
            y = c;
        } else {
            x = a;
            y = b;
        }

        // Check the Pythagorean condition
        return (x * x + y * y == max * max);
    }

    public static void main(String[] args) {
        System.out.println(isPythagoreanTriplet(3, 4, 5));   // true
        System.out.println(isPythagoreanTriplet(5, 12, 13)); // true
        System.out.println(isPythagoreanTriplet(1, 2, 3));   // false
    }
}
