public class Zavd1 {
    public static void main(String[] args) {
        double a = 1;

        double b = 5;

        double c = 6;

        double discriminant = b * b - 4 * a * c;
        double root1, root2;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Рішення: " + root1 + " та " + root2);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("Рішення: " + root1);
        } else {
            System.out.println("Рішень немає");
        }
    }
}
