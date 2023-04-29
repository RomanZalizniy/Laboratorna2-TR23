public class Zavd2 {
    public static void main(String[] args) {
        double x = 3.5;
        double y = -2.0;

        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться в першому квадранті.");
        }  else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться в другому квадранті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться в третьому квадранті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться в четвертому квадранті.");
        } else {
            System.out.println("Точка знаходиться на координатній вісі.");
        }

    }
}
