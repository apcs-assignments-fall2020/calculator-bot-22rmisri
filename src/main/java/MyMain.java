// Chloe Burrows and I worked together
import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(final int a, final int b, final int c) {
        final int d = Math.max(a, b);
        final int e = Math.max(b, c);
        final int f = Math.max(d, e);
        final int g = Math.min(a, b);
        final int h = Math.min(b, c);
        final int i = Math.min(g, h);
        final int j = a + b + c;
        final int k = i + f;
        final int l = j - k;
        return l;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(final int a, final int b) {
        final int c = Math.max(Math.abs(a), Math.abs(b));
        if (c == Math.abs(a)) {
            return a;
        }
        else{
            return b;
        }
        


        // REPLACE WITH YOUR CODE
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(final int a, final int b) {
        final double a3 = Math.pow(a, 2);
        final double b3 = Math.pow(b, 2);
        final double c = Math.sqrt(b3 + a3);
        return c; // REPLACE WITH YOUR CODE
    }

    public static void main(final String[] args) {
        // You may want to keep these lines of code to test that your methods work
         // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out");
        String command = scan.next();
        if (command.equals("Median")) {
            System.out.println("What is the first number?");
            int num1 = scan.nextInt();
            System.out.println("What is the second number?");
            int num2 = scan.nextInt();
            System.out.println("What is the third number?");
            int num3 = scan.nextInt();
            System.out.println("The median is " + median(num1, num2, num3));
        }
        else if (command.equals("Magnitude")) {
            System.out.println("What is the first number?");
            int num4 = scan.nextInt();
            System.out.println("What is the second number?");
            int num5 = scan.nextInt();
            System.out.println("The magnitude is " + magnitude(num4, num5));
        }
            
            
        else {
            System.out.println("What is the first number?");
            int num6 = scan.nextInt();
            System.out.println("What is the second number?");
            int num7 = scan.nextInt();
            System.out.println("The hypotenuse is " + pythagoras(num6, num7));

        }


        
    }
}
