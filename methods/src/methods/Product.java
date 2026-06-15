package methods;
public class Product {
    static int product(int n) {
        if (n == 1) {
            return 1;
        }
        return n * product(n - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        System.out.println("Product of values from 1 to " + number + " is: " + product(number));
    }
}