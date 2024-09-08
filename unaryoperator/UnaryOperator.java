package unaryoperator;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = -5;
        boolean isTrue = true;

        // Increment
        System.out.println("x awal: " + x);
        System.out.println("++x: " + ++x); //Pre - increment
        System.out.println("x++: " + x++); //Post - increment
        System.out.println("x akhir : " + x);

        // Decrement
        System.out.println("x awal: " + x);
        System.out.println("++x: " + --x); // Pre - decrement
        System.out.println("x++: " + x--); // Post - decrement
        System.out.println("x akhir : " + x);

        // Unary plus and minus
        System.out.println("+x : " + x);
        System.out.println("-y : " + -y);

        // Logical Bot
        System.out.println("!isTrue : " + !isTrue);
    }
}
