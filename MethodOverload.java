import java.util.Scanner;

class MethodOverload{

    // Method 1: adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: adds two double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MethodOverload obj = new MethodOverload();

        System.out.println("Enter two integers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Addition of two integers: " + obj.add(x, y));

        System.out.println("Enter three integers:");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Addition of three integers: " + obj.add(p, q, r));

        System.out.println("Enter two double numbers:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Addition of two doubles: " + obj.add(d1, d2));
    }
}
